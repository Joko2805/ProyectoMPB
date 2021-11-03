package com.demo.mpb.model;

import java.io.Serializable;

public class Grado implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer gradoId;
	private String nombre;
	private Byte estado;

	public Grado() {
	}

	public Grado(Integer gradoId, String nombre, Byte estado) {
		super();
		this.gradoId = gradoId;
		this.nombre = nombre;
		this.estado = estado;
	}

	public Integer getGradoId() {
		return gradoId;
	}

	public void setGradoId(Integer gradoId) {
		this.gradoId = gradoId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Byte getEstado() {
		return estado;
	}

	public void setEstado(Byte estado) {
		this.estado = estado;
	}
}
