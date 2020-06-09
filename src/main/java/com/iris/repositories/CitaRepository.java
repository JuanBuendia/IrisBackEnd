package com.iris.repositories;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;

import com.iris.entities.Cita;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface CitaRepository extends CrudRepository<Cita, Integer>{
	
	public Cita findByIdCita(Integer idCita);
	public Cita findByHora(Time hora);
	public Cita findByFecha(Date fecha);
	
	@Query(value = "SELECT * FROM CITAS WHERE CURRENT_DATE = FECHA", nativeQuery = true)
	ArrayList<Cita> todayCitations();
}