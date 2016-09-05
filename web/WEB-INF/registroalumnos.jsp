<%-- 
    Document   : registroalumnos
    Created on : 05/09/2016, 02:18:32 PM
    Author     : alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="newpackage1.alumnoIO"%>
<%@page import="newpackage1.login"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registroe</title>
   
  
      <%
        String codigo=request.getParameter("codigo");
        String nombre=request.getParameter("nombre");
        String appaterno=request.getParameter("appaterno");
        String apmaterno=request.getParameter("apmaterno");
        String edad=request.getParameter("edad");
        String email=request.getParameter("email");
        
        alumnos alumno = new alumnos(codigo, nombre, appaterno, apmaterno,email);
        
        ServletContext sc = getServletContext();
        String ruta=sc.getRealPath("/WEB-INF/ListaAlumno.txt");
        
        alumnoIO.Agregar(alumno, ruta);
    %>
    <body>
        <h1>Registro de Matricula</h1>
        <p>Ingrese datos de los cursos a matricularse</p>
        <p>Datos anteriones: <%=codigo%> <%=nombre%> <%=appaterno%> <%=apmaterno%> <%=email%> </p>
        <form action method="get">
            <table cellspacing="5" border="0">
                <tr  style="text-align: center">Ciclo
                    <td><input type="text" name="ciclo1"></td>
                    <td><input type="text" name="nombre1"></td>
                    <td><input type="text" name="creditos1"></td>
                </tr>
                <tr style="text-align: center">Nombre
                    <td><input type="text" name="ciclo2"></td>
                    <td><input type="text" name="nombre2"></td>
                    <td><input type="text" name="creditos2"></td>
                </tr>
                <tr style="text-align: center">Creditos
                   <td><input type="text" name="ciclo3"></td>
                    <td><input type="text" name="nombre3"></td>
                    <td><input type="text" name="creditos3"></td>
                </tr>
                
                <tr>
                    <td colspan="4" align="center"><input type="submit" value="Enviar"></td>
                </tr>
            </table>
        </form>
      
        
        
    </body>
</html>
