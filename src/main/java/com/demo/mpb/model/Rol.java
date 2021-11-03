package com.demo.mpb.model;

import java.io.Serializable;

public class Rol implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer rolId;
	private String descripcion;
	private Byte estado;

	public Rol() {
	}

	public Rol(Integer rolId, String descripcion, Byte estado) {
		super();
		this.rolId = rolId;
		this.descripcion = descripcion;
		this.estado = estado;
	}

	public Integer getRolId() {
		return rolId;
	}

	public void setRolId(Integer rolId) {
		this.rolId = rolId;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Byte getEstado() {
		return estado;
	}

	public void setEstado(Byte estado) {
		this.estado = estado;
	}

}
