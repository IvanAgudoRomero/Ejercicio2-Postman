package com.example.Ejercicio2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

//Este controlador se encarga de devolver la persona introducida con su edad multiplicada por 2
@RestController()
public class Controlador2 {

    //Llamas al servicio
    @Autowired
    Servicio s;

    //Al tratarse de un post no requiere recoleccion de datos
    @PostMapping("/controlador2/getPersona")
    public Persona getPersona(){
        //Obtienes la persona a partir de la existente en el servicio de la petición anterior (explicado abajo)
        Persona p = s.getPersona();
        p.setEdad(p.getEdad()*2);  //Se multiplica la edad por 2

        return p;
    }
    /*
    * La primera peticion obtiene los datos del header y los guarda en el servicio. La segunda peticion, un post, se
    * encarga de recoger los datos almacenados en servicio y sumarle a la edad 2 puesto que lo que se almacena en el
    * servicio es un objeto persona
    */
}
