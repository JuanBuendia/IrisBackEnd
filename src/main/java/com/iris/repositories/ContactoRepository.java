/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iris.repositories;

import com.iris.entities.Contacto;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface ContactoRepository extends CrudRepository<Contacto, Integer> {

	public Contacto findByNombres(String nombres);
	public Contacto findByIdContacto(Integer idContacto);
}