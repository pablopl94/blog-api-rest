package com.sistema.blog.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistema.blog.api.dto.PublicacionDto;
import com.sistema.blog.api.entities.Publicacion;
import com.sistema.blog.api.repositories.IPublicacionRepository;

@Service
public class PublicacionServiceImpl implements IPublicacionService {

	@Autowired
	private IPublicacionRepository publicacionRepository;
	
	@Override
	public Publicacion findById(Integer pk) {
		
		return publicacionRepository.findById(pk).orElse(null);
	}

	@Override
	public List<Publicacion> findAll() {
		return publicacionRepository.findAll();
	}

	@Override
	public Publicacion updateOne(Publicacion entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Publicacion insertOne(Publicacion entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteOne(Integer pk) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PublicacionDto createPublicacion(PublicacionDto publicacionDto) {
		// TODO Auto-generated method stub
		return null;
	}

}
