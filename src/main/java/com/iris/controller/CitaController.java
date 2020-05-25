package com.iris.controller;


import java.sql.Date;
import java.sql.Time;
import com.iris.entities.Cita;
import com.iris.services.CitaService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CitaController {
	
	@Autowired
	private CitaService citaService;
	
	@RequestMapping("/citas")
	public @ResponseBody
	Iterable<Cita> findAll(){
		return citaService.findAllCitas();
	}
	
	@PostMapping("citas")
	public void save(@RequestBody Cita cita) {
		citaService.save(cita);
	}
	
	@RequestMapping("/citas/{id}")
	public Cita findById(@PathVariable Integer idCita) {
		System.out.println(idCita);
		return citaService.findByIdCita(idCita);
	}
	
	@RequestMapping("/citas/fecha/{fecha}")
	public Cita findByFecha(@PathVariable Date fecha) {
		System.out.println(String.valueOf(fecha));
		return citaService.findByFecha(fecha);
	}
	
	@RequestMapping("/citas/hora/{hora}")
	public Cita findByHora(@PathVariable Time hora) {
		System.out.println(String.valueOf(hora));
		return citaService.findByHora(hora);
	}
}