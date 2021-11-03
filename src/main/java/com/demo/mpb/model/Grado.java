package com.demo.mpb.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="grados")
public class Grado implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "grado_id")
	private Integer gradoId;
	@Column(length = 50)
	private String nombre;
	@Column 
	private Byte estado;
	@OneToMany(mappedBy = "grado", cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE})
    private List<Seccion> itemSeccion =new ArrayList<>();
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
