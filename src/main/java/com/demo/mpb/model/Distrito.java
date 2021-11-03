package com.demo.mpb.model;

import java.io.Serializable;

public class Distrito implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer distritoId;
	private String nombre;
	private Byte estado;

	public Distrito() {
	}

	public Distrito(Integer distritoId, String nombre, Byte estado) {
		super();
		this.distritoId = distritoId;
		this.nombre = nombre;
		this.estado = estado;
	}

	public Integer getDistritoId() {
		return distritoId;
	}

	public void setDistritoId(Integer distritoId) {
		this.distritoId = distritoId;
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
