package com.sistema.blog.api.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResoruceNotFoundExceptions extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private String nombreDelRecurso;
	private String nombreDelCampo;
	private long valorDelCampo;

	public ResoruceNotFoundExceptions(String nombreDelRecurso, String nombreDelCampo, long valorDelCampo) {
		super(String.format("% No encontrado con : %s : '%s'", nombreDelRecurso, nombreDelCampo, valorDelCampo));
		this.nombreDelRecurso = nombreDelRecurso;
		this.nombreDelCampo = nombreDelCampo;
		this.valorDelCampo = valorDelCampo;
	}

	public String getNombreDelRecurso() {
		return nombreDelRecurso;
	}

	public void setNombreDelRecurso(String nombreDelRecurso) {
		this.nombreDelRecurso = nombreDelRecurso;
	}

	public String getNombreDelCampo() {
		return nombreDelCampo;
	}

	public void setNombreDelCampo(String nombreDelCampo) {
		this.nombreDelCampo = nombreDelCampo;
	}

	public long getValorDelCampo() {
		return valorDelCampo;
	}

	public void setValorDelCampo(long valorDelCampo) {
		this.valorDelCampo = valorDelCampo;
	}

}
