/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usuarios.clasesObjeto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Stimp
 */
public class Persona {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)   
String id;
private String nombre;
String apellidos;
int edad;

String correo;
String dni;
int telefono;
String direccion;
int cp;

    public String getCorreo() {
        return correo;
    }

    public String getDni() {
        return dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getCp() {
        return cp;
    }

    public Persona(String id, String nombre, String apellidos, int edad, String correo, String dni, int telefono, String direccion, int cp) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.correo = correo;
        this.dni = dni;
        this.telefono = telefono;
        this.direccion = direccion;
        this.cp = cp;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

  
 
  

    public Persona() {
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }









    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setId(String parameter) {
this.id=parameter;
        
        }


}
