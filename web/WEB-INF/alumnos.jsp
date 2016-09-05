<%-- 
    Document   : alumnos
    Created on : 05/09/2016, 02:13:19 PM
    Author     : alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>registro de alumnos</title>
    </head>
    <body>
         <h1>registro alumnos</h1><hr>
        <p>Ingrese datos del Alumno</p>
        <form action="RegistroAlumno.jsp" method="get">
            <table>
                <tr>
                    <td>Codigo</td>
                    <td><input type="text" name="codigo"></td>
                </tr>
                <tr>
                    <td>Nombre</td>
                    <td><input type="text" name="nombre"></td>
                </tr>
                <tr>
                    <td>Ap.Paterno</td>
                    <td><input type="text" name="appaterno"></td>
                </tr>
                <tr>
                    <td>Ap.Materno</td>
                    <td><input type="text" name="apmaterno"></td>
                </tr>
                <tr>
                    <td>Edad</td>
                    <td><input type="text" name="edad"></td>
                </tr>
                <tr>
                    <td>Email</td>
                    <td><input type="email" name="email"></td>
                </tr>
                <tr>
                    <td colspan="2"align="center"><input type="submit" value="Enviar"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
