package com.iris.services;

import java.util.List;
import java.util.ArrayList;
import com.iris.entities.Contacto;
import org.springframework.stereotype.Service;
import com.iris.repositories.ContactoRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ContactoService {
   
	@Autowired
    ContactoRepository contactoRepository;
    
    public  Iterable<Contacto> findAll() {
        return contactoRepository.findAll();
    }

    public List<Contacto> findAll1() {
        Iterable<Contacto> it = contactoRepository.findAll();
        ArrayList<Contacto> personas = new ArrayList<Contacto>();
        it.forEach(e -> personas.add(e));
        return personas;
    }
     
    public Contacto  findByIdContacto(Integer codigoPersona) {
        return  contactoRepository.findByIdContacto(codigoPersona);
    }
    
    public void save(Contacto persona) {
        contactoRepository.save(persona);
    }
    
    //TODO manejar error por diferencias de parametros
    
    public ArrayList<Contacto> getListPatients(){
    	return contactoRepository.getListPatients();
    }
    
    public Contacto findByDocumento(String documento) {
    	return contactoRepository.findByDocumento(documento);
    }
    
    public ArrayList<Contacto> findByName(String nombre) {
    	return contactoRepository.findByName(nombre);
    }
    
    public ArrayList<Contacto> findByLastName(String apellidos) {
    	return contactoRepository.findByLastName(apellidos);
    }
}