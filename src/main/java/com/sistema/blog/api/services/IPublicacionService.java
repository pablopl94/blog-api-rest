package com.sistema.blog.api.services;

import com.sistema.blog.api.dto.PublicacionDto;
import com.sistema.blog.api.entities.Publicacion;

public interface IPublicacionService extends IGenericCrud<Publicacion, Integer>{

	public PublicacionDto newPublicacion (PublicacionDto publicacionDto);
}
