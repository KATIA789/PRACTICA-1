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
public class matriculas {
 private String ciclo,nombre,creditos;

    public matriculas (String ciclo, String nombre, String creditos) {
        this.ciclo = ciclo;
        this.nombre = nombre;
        this.creditos = creditos;
        
    }

    public String getCiclo() {
        return ciclo;
    }
/**
 * 
 * @param ciclo 
 */
    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
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

    public String getCreditos() {
        return creditos;
    }
/**
 * 
 * @param creditos 
 */
    public void setCreditos(String creditos) {
        this.creditos = creditos;
    }
    
}

