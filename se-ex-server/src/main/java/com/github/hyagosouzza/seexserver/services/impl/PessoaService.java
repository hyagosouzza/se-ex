package com.github.hyagosouzza.seexserver.services.impl;

import com.github.hyagosouzza.seexserver.dtos.PessoaCommand;
import com.github.hyagosouzza.seexserver.dtos.PessoaInListDto;
import com.github.hyagosouzza.seexserver.dtos.SingularPessoaDto;
import com.github.hyagosouzza.seexserver.exceptions.ResourceNotFoundException;
import com.github.hyagosouzza.seexserver.mappers.PessoaMapper;
import com.github.hyagosouzza.seexserver.persistence.Pessoa;
import com.github.hyagosouzza.seexserver.repositories.PessoaRepository;
import com.github.hyagosouzza.seexserver.services.IPessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PessoaService implements IPessoaService {

	@Autowired
	PessoaRepository repository;

	@Autowired
	PessoaMapper mapper;

	@Transactional
	public Pessoa save(final PessoaCommand command) {
		final Pessoa pessoa = mapper.fromCommand(command);
		return repository.save(pessoa);
	}

	public List<PessoaInListDto> listAll() {
		return mapper.toPessoaInList(repository.findAll());
	}

	public SingularPessoaDto findById(final Long id) {
		return repository.findById(id)
				.map((final Pessoa pessoa) -> mapper.toSingular(pessoa))
				.orElseThrow(() -> new ResourceNotFoundException("Pessoa com id " + id + " não existe."));
	}

}
