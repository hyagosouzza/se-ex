package com.github.hyagosouzza.seexserver.services;

import java.util.List;

public interface IAbstractService<T> {

	List<T> listAll();

	T save(T entity);

}
