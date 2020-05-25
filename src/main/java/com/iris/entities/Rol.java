package com.iris.entities;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "roles")
public class Rol {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idRol;
	private String nombre;
	
	public Rol() {
	}

	public Rol(int idRol, String nombre) {
		super();
		this.idRol = idRol;
		this.nombre = nombre;
	}

	public int getIdRol() {
		return idRol;
	}

	public void setIdRol(int idRol) {
		this.idRol = idRol;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}