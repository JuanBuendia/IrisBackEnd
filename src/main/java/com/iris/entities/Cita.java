package com.iris.entities;

import java.sql.Date;
import java.sql.Time;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "citas")
public class Cita {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idCita;
	private String tipo;
	private String observaciones;
	private Date fecha;
	private Time hora;
	private String estado;
	
	public Cita() {
	}

	public Cita(int idCita, String tipo, String observaciones, Date fecha, Time hora, String estado) {
		super();
		this.idCita = idCita;
		this.tipo = tipo;
		this.observaciones = observaciones;
		this.fecha = fecha;
		this.hora = hora;
		this.estado = estado;
	}

	public int getIdCita() {
		return idCita;
	}

	public void setIdCita(int idCita) {
		this.idCita = idCita;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Time getHora() {
		return hora;
	}

	public void setHora(Time hora) {
		this.hora = hora;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
}