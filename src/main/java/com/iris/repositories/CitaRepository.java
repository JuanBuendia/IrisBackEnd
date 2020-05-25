package com.iris.repositories;

import java.sql.Date;
import java.sql.Time;
import com.iris.entities.Cita;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface CitaRepository extends CrudRepository<Cita, Integer>{
	
	public Cita findByIdCita(Integer idCita);
	public Cita findByHora(Time hora);
	public Cita findByFecha(Date fecha);
}