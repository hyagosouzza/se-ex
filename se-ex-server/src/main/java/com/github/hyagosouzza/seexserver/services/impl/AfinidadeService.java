package com.github.hyagosouzza.seexserver.services.impl;

import com.github.hyagosouzza.seexserver.exceptions.ResourceNotFoundException;
import com.github.hyagosouzza.seexserver.persistence.Afinidade;
import com.github.hyagosouzza.seexserver.repositories.AfinidadeRepository;
import com.github.hyagosouzza.seexserver.services.IAfinidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AfinidadeService extends AbstractService<Afinidade> implements IAfinidadeService {

	private final AfinidadeRepository repository;

	@Autowired
	public AfinidadeService(AfinidadeRepository repository) {
		super(repository);
		this.repository = repository;
	}

	public Afinidade findAfinidadeByRegiao(final String regiao) {
		return repository.findByRegiao(regiao).orElseThrow(() -> new ResourceNotFoundException("A região informada (" + regiao + ") não existe."));
	}

}
