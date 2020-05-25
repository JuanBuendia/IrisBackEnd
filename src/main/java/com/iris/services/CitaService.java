package com.iris.services;

import java.sql.Date;
import java.sql.Time;
import java.util.List;
import java.util.ArrayList;
import com.iris.entities.Cita;
import org.springframework.stereotype.Service;
import com.iris.repositories.CitaRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class CitaService {

	@Autowired
	CitaRepository citaRepository;
	
	public Iterable<Cita> findAll(){
		return citaRepository.findAll();
	}
	
	public List<Cita> findAllCitas(){
		Iterable<Cita> it = citaRepository.findAll();
		ArrayList<Cita> citas = new ArrayList<>();
		it.forEach(e -> citas.add(e));
		return citas;
	}
	
	public Cita findByIdCita(Integer idCita) {
		return citaRepository.findByIdCita(idCita);
	}
	
	public Cita findByFecha(Date fecha) {
		return citaRepository.findByFecha(fecha);
	}
	
	public Cita findByHora(Time hora) {
		return citaRepository.findByHora(hora);
	}
	
	public void save(Cita agenda) {
		citaRepository.save(agenda);
	}
}