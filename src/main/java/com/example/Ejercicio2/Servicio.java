package com.example.Ejercicio2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Servicio {

    //Una vez en el servicio se instancia una persona
    Persona p = new Persona();

    //Se hace este método para rellenar el objeto persona y se devuelve una vez relleno
    public Persona createPersona(String nombre, int edad, String ciudad){
        p.setCiudad(ciudad);
        p.setEdad(edad);
        p.setNombre(nombre);

        return p;
    }

    //getter de persona
    public Persona getPersona(){
        return p;
    }
}
