package com.github.hyagosouzza.seexserver.services.impl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public abstract class AbstractService<T> {

	private final JpaRepository<T, ?> repository;

	protected AbstractService(final JpaRepository<T, ?> repository) {
		this.repository = repository;
	}

	public List<T> listAll() {
		return repository.findAll();
	}

	@Transactional
	public T save(final T entity) {
		return repository.save(entity);
	}

}
