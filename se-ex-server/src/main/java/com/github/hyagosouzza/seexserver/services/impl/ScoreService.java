package com.github.hyagosouzza.seexserver.services.impl;

import com.github.hyagosouzza.seexserver.dtos.ScoreCommand;
import com.github.hyagosouzza.seexserver.exceptions.ResourceNotFoundException;
import com.github.hyagosouzza.seexserver.mappers.ScoreMapper;
import com.github.hyagosouzza.seexserver.persistence.Score;
import com.github.hyagosouzza.seexserver.repositories.ScoreRepository;
import com.github.hyagosouzza.seexserver.services.IScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ScoreService implements IScoreService {

	@Autowired
	ScoreMapper scoreMapper;

	@Autowired
	ScoreRepository repository;

	public List<Score> listAll() {
		return repository.findAll(Sort.by("inicial"));
	}

	public Score findByScoreValue(final Integer value) {
		return repository.findByScoreValue(value).orElseThrow(() -> new ResourceNotFoundException("O valor score informado (" + value + ") não existe."));
	}

	@Transactional
	public Score save(final ScoreCommand command) {
		final Score score = scoreMapper.fromCommand(command);
		return repository.save(score);
	}

}
