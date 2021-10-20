package com.demo.mpb.model;

import java.io.Serializable;

public class Cargo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idCargo;
	private String descripcion;
	private Byte estado;
	
	public Cargo () {};
	
	public Cargo(Integer idCargo, String descripcion, Byte estado) {
		super();
		this.idCargo = idCargo;
		this.descripcion = descripcion;
		this.estado = estado;
	}

	public Integer getIdCargo() {
		return idCargo;
	}

	public void setIdCargo(Integer idCargo) {
		this.idCargo = idCargo;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
