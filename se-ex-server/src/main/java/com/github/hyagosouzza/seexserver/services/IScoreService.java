package com.github.hyagosouzza.seexserver.services;

import com.github.hyagosouzza.seexserver.dtos.ScoreCommand;
import com.github.hyagosouzza.seexserver.exceptions.ResourceNotFoundException;
import com.github.hyagosouzza.seexserver.mappers.ScoreMapper;
import com.github.hyagosouzza.seexserver.persistence.Score;
import com.github.hyagosouzza.seexserver.repositories.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IScoreService {

	List<Score> listAll();

	Score findByScoreValue(Integer value);

	Score save(ScoreCommand command);

}
