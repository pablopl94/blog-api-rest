package com.sistema.blog.api.services;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistema.blog.api.dto.PublicacionDto;
import com.sistema.blog.api.entities.Publicacion;
import com.sistema.blog.api.repositories.IPublicacionRepository;

@Service
public class PublicacionServiceImpl implements IPublicacionService {

	@Autowired
	private IPublicacionRepository publicacionRepository;
	
	@Autowired
	private ModelMapper mapper;
	
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

	//Metodo que recibe un Dto, lo pasamos a entidad Publicacion, lo guardamos y devolvemos el dto como respuesta otra vez
	@Override
	public PublicacionDto newPublicacion(PublicacionDto publicacionDto) {
		
		Publicacion publicacion = mapper.map(publicacionDto, Publicacion.class);
		publicacionRepository.save(publicacion);
		
		PublicacionDto newPublicacionDto = mapper.map(publicacion, PublicacionDto.class);
		return newPublicacionDto;
	}


}
