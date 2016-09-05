/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author alumno
 */
public class alumnos {
  private String codigo,nombre,appaterno,apmaterno, edad,email;

    
    public alumnos (String codigo, String nombre, String appaterno, String apmaterno, String edad, String email) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.appaterno = appaterno;
        this.apmaterno = apmaterno;
        this.email = email;
    }
    public String getCodigo() {
        return codigo;
    }
/**
 * 
 * @param codigo 
 */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }
/**
 * 
 * @param nombre 
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidopaterno() {
        return appaterno;
    }
/**
 * 
 * @param appaterno 
 */
    public void setApellidopaterno(String appaterno) {
        this.appaterno = appaterno;
    }

    public String getApellidomaterno() {
        return apmaterno;
    }
/**
 * 
 * @param apmaterno 
 */
    public void setApellidomaterno(String apmaterno) {
        this.apmaterno = apmaterno;
    }

    public String getEdad() {
        return edad;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    
}

