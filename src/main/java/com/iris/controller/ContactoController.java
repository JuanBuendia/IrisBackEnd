package com.iris.controller;

import com.iris.entities.Contacto;
import com.iris.services.ContactoService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
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
}