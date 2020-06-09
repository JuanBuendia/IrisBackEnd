package com.iris.repositories;

import java.util.ArrayList;
import com.iris.entities.Contacto;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface ContactoRepository extends CrudRepository<Contacto, Integer> {

	public Contacto findByNombres(String nombres);
	public Contacto findByIdContacto(Integer idContacto);
	
	@Query(value = "SELECT NOMBRES, APELLIDOS, DATE_PART('YEAR', AGE(FECHA_NACIMIENTO)) AS EDAD "
			+ "FROM CONTACTOS WHERE ID_ROL = 1", nativeQuery = true)
	ArrayList<Contacto> getListPatients();
	
	@Query(value = "SELECT NOMBRES, APELLIDOS, DATE_PART('YEAR', AGE(FECHA_NACIMIENTO)) AS EDAD "
			+ "FROM CONTACTOS WHERE DOCUMENTO = ?1", nativeQuery = true)
	Contacto findByDocumento(String documento);
	
	@Query(value = "SELECT NOMBRES, APELLIDOS, DATE_PART('YEAR', AGE(FECHA_NACIMIENTO)) AS EDAD "
			+ "FROM CONTACTOS WHERE NOMBRES = ?1", nativeQuery = true)
	ArrayList<Contacto> findByName(String Nombre);
	
	@Query(value = "SELECT NOMBRES, APELLIDOS, DATE_PART('YEAR', AGE(FECHA_NACIMIENTO)) AS EDAD "
			+ "FROM CONTACTOS WHERE APELLIDOS = ?1", nativeQuery = true)
	ArrayList<Contacto> findByLastName(String Nombre);
}