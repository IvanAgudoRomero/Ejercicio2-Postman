package com.example.Ejercicio2;

import lombok.Data;
import org.springframework.stereotype.Component;

//Clase persona con constructor lleno y vacío, setters y getters
@Data
public class Persona {
    String nombre;
    int edad;
    String ciudad;

    public Persona() {
    }

    public Persona(String nombre, int edad, String ciudad) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

}
