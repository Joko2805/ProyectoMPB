package com.demo.mpb.model;

import java.io.Serializable;

public class Distrito implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idDistrito;
	private String nombre;
	private Byte estado;
	
	public Distrito() {}
	public Distrito(Integer idDistrito, String nombre, Byte estado) {
		super();
		this.idDistrito = idDistrito;
		this.nombre = nombre;
		this.estado = estado;
	}
	public Integer getIdDistrito() {
		return idDistrito;
	}
	public void setIdDistrito(Integer idDistrito) {
		this.idDistrito = idDistrito;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
