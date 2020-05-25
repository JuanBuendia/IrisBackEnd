package com.iris.controller;

import com.iris.entities.Rol;
import com.iris.services.RolService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RolController {

	@Autowired
	private RolService rolService;
	
	@RequestMapping("/roles")
	public @ResponseBody
	Iterable<Rol> findAll(){
		return rolService.findAllRoles();
	}
	
	@PostMapping("roles")
	public void save(@RequestBody Rol rol) {
		rolService.save(rol);
	}
	
	@RequestMapping("/roles/{idRol}")
	public Rol findByRol(@PathVariable Integer idRol) {
		System.out.println(idRol);
		return rolService.findByIdRol(idRol);
	}
}