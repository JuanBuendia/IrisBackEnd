package com.iris.services;

import java.util.List;
import java.util.ArrayList;
import com.iris.entities.Rol;
import com.iris.repositories.RolRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class RolService {

	@Autowired
	RolRepository rolRepository;
	
	public Iterable<Rol> findAll(){
		return rolRepository.findAll();
	}
	
	public List<Rol> findAllRoles(){
		Iterable<Rol> it = rolRepository.findAll();
		ArrayList<Rol> roles = new ArrayList<>();
		it.forEach(e -> roles.add(e));
		return roles;
	}
	
	public Rol findByIdRol(Integer idRol) {
		return rolRepository.findByIdRol(idRol);
	}
	
	public Rol findByNombre(String nombre) {
		return rolRepository.findByNombre(nombre);
	}
	
	public void save(Rol rol) {
		rolRepository.save(rol);
	}
}