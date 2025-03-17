package com.sistema.blog.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistema.blog.api.entities.Publicacion;

public interface IPublicacionRepository extends JpaRepository<Publicacion, Integer>{

}
