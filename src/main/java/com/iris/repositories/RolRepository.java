package com.iris.repositories;

import com.iris.entities.Rol;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface RolRepository extends CrudRepository<Rol, Integer>{

	public Rol findByNombre(String nombre);
	public Rol findByIdRol(Integer idRol);
}