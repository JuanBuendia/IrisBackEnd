package com.iris.entities;

import java.sql.Date;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "contactos")
public class Contacto {
	
		@Id 
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int idContacto;
		private String nombres;
		private String apellidos;
		private Date fechaNacimiento; 
		private String telefono;
		private String direccion;
		private String tipoDocumento;
		private String documento;

		public Contacto() {
		}

		public Contacto(int idContacto, String nombres, String apellidos, Date fechaNacimiento, String telefono,
				String direccion, String tipoDocumento, String documento) {
			this.idContacto = idContacto;
			this.nombres = nombres;
			this.apellidos = apellidos;
			this.fechaNacimiento = fechaNacimiento;
			this.telefono = telefono;
			this.direccion = direccion;
			this.tipoDocumento = tipoDocumento;
			this.documento = documento;
		}

		public int getIdContacto() {
			return idContacto;
		}

		public void setIdContacto(int idContacto) {
			this.idContacto = idContacto;
		}

		public String getNombres() {
			return nombres;
		}

		public void setNombres(String nombres) {
			this.nombres = nombres;
		}

		public String getApellidos() {
			return apellidos;
		}

		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}

		public Date getFechaNacimiento() {
			return fechaNacimiento;
		}

		public void setFechaNacimiento(Date fechaNacimiento) {
			this.fechaNacimiento = fechaNacimiento;
		}

		public String getTelefono() {
			return telefono;
		}

		public void setTelelefono(String tel) {
			this.telefono = tel;
		}

		public String getDireccion() {
			return direccion;
		}

		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}

		public String getTipoDocumento() {
			return tipoDocumento;
		}

		public void setTipoDocumento(String tipoDocumento) {
			this.tipoDocumento = tipoDocumento;
		}

		public String getDocumento() {
			return documento;
		}

		public void setDocumento(String documento) {
			this.documento = documento;
		}
}