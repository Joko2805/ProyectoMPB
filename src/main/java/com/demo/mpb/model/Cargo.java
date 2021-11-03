package com.demo.mpb.model;

import java.io.Serializable;

public class Cargo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer cargoId;
	private String descripcion;
	private Byte estado;

	public Cargo() {
	}

	public Cargo(Integer cargoId, String descripcion, Byte estado) {
		super();
		this.cargoId = cargoId;
		this.descripcion = descripcion;
		this.estado = estado;
	}

	public Integer getCargoId() {
		return cargoId;
	}

	public void setCargoId(Integer cargoId) {
		this.cargoId = cargoId;
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
