/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage1;
import java.io.IOException;
/**
 *
 * @author alumno
 */
public class login {
    public static String user="adm" ;
public static String con = "123";
public static String validar(String usuario,String contraseña) throws IOException
{        
    if (usuario.equals(user) &&  contraseña.equals(con)) {
       
     return "";
       
        
    }

    return "INGRESO";
}

}
