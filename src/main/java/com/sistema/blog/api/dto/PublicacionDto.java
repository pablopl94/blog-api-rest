package com.sistema.blog.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

public class PublicacionDto {
	
	private int idPublicacion;
	private int titulo;
	private String descripcion;
	private String contenido;
}
