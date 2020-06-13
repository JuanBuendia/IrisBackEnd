package com.iris.controller;

import com.iris.entities.Contacto;
import com.iris.services.ContactoService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactoController {

    @Autowired
    private ContactoService contactoService;

    @RequestMapping("/contactos")
    public @ResponseBody
    Iterable<Contacto> findAll() {
        return contactoService.findAll1();
    }

    @PostMapping("/contactos")
    public void save(@RequestBody Contacto persona) {
        contactoService.save(persona);
    }
 
    @RequestMapping("/contactos/{idContacto}")
    public Contacto findById(@PathVariable Integer idContacto){
        System.out.println(idContacto);
        return contactoService.findByIdContacto(idContacto);
    }
    
    @RequestMapping("/contactos/documentos/{documento}")
    public Contacto findByDocumentNumber(@PathVariable String documento){
        System.out.println(documento);
        return contactoService.findByDocumento(documento);
    }
    
    @RequestMapping("/contactos/search/{nombre}")
    public ArrayList<Contacto> findByUserName(@PathVariable String nombre){
        return contactoService.findByName(nombre);
    }
    
    @RequestMapping("/contactos/search/lastName/{apellido}")
    public ArrayList<Contacto> findByUserLastName(@PathVariable String apellido){
        return contactoService.findByName(apellido);
    }
}