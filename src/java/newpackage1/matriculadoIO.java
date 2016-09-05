/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage1;
import newpackage.matriculas;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
/**
 *
 * @author alumno
 */
public class matriculadoIO {
     public static void Agregar(matriculas matricula,String RutaArchivo) throws IOException
    {
        File file = new File(RutaArchivo);
        PrintWriter out = new PrintWriter( new FileWriter(file, true) );
        out.println(matricula.getCiclo()+ "|" 
                + matricula.getNombre()+ "|" 
                + matricula.getCreditos()+ "|" 
                + matricula.getTurno());        
        out.close(); 
    }
}