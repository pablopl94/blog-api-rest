package com.sistema.blog.api.services;

import java.util.List;

public interface IGenericCrud <E,ID> {

	E findById (ID pk);
	List<E> findAll ();
	E updateOne (E entity);
	E insertOne (E entity);
	void deleteOne (ID pk);
}
