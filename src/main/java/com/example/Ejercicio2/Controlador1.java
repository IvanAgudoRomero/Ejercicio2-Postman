package com.example.Ejercicio2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

//Desde este controlador se va a devolver la persona indicada en el header
@RestController()
public class Controlador1 {

    //Se llama al servicio
    @Autowired
    Servicio s;

    //Obtienes los valores de los atributos de persona a partir de las headers de la petición
    @GetMapping("/controlador1/addPersona")
    public Persona addPersona(@RequestHeader (value="nombre") String nombre, @RequestHeader (value="edad") int edad, @RequestHeader (value="ciudad") String ciudad){
        //Llamas al método del servicio que rellena y devuelve un objeto persona
        return s.createPersona(nombre, edad, ciudad);
    }

}
