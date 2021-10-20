package com.demo.mpb.model;
import java.io.*;
public class Grado implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idGrado;
	private String nombre;
	private Byte estado;
	public Grado() {};
	public Grado(Integer idGrado, String nombre, Byte estado) {
		super();
		this.idGrado = idGrado;
		this.nombre = nombre;
		this.estado = estado;
	}
	public Integer getIdGrado() {
		return idGrado;
	}
	public void setIdGrado(Integer idGrado) {
		this.idGrado = idGrado;
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
