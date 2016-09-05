/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage1;
import newpackage.alumnos;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
/**
 *
 * @author alumno
 */
public class alumnoIO {
    
public static void Agregar(alumnos alumno,String RutaArchivo) throws IOException
    {
        File file = new File(RutaArchivo);
        PrintWriter out = new PrintWriter( new FileWriter(file, true) );
        out.println(alumno.getCodigo()+ "|" 
                + alumno.getNombre()+ "|" 
                + alumno.getApellidopaterno()+ "|"
                + alumno.getApellidomaterno()+ "|"
                + alumno.getEmail());        
        out.close(); 
}
}

