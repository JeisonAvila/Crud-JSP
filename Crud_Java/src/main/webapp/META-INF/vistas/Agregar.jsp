<%-- 
    Document   : Agregar
    Created on : 13/05/2023, 8:00:56 p. m.
    Author     : HUAWEI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <h1>Agregar Resgitro</h1>
            <form action="Controlador">
                ID: <br>
                <input type="text" name="txtId">
                <input type="text" name="txtClave">
                <input type="text" name="txtNombre">
                <input type="text" name="txtCategoria">
                <input type="text" name="txtWeb">
                <input type="text" name="txtRector">
                <input type="text" name="txtTelefono">
                <input type="text" name="txtCiudad">
                <input type="text" name="txtNumCarreras">
                <input type="text" name="txtNumSedes">
                <input type="submit" name="Agregar">
            </form>
        </div>
       
    </body>
</html>
