

<%@page import="modelo.usuario"%>
<%@page import="modelo_dao.Usuario_dao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <%
            Usuario_dao dao = new Usuario_dao();
            int Id=Integer.parseInt((String)request.getAttribute("Id"));
            usuario c =(usuario)dao.list(Id);
            
            
            
            %>
         <h1>Modificar Resgitro</h1>
            <form action="Controlador">
                ID: <br>
                <input type="text" name="txtId" values ="<%= c.getId()%>">
                <input type="text" name="txtClave" values="<%= c.getClave()%>">
                <input type="text" name="txtNombre" values="<%= c.getNombre()%>">
                <input type="text" name="txtCategoria" values="<%= c.getCategoria()%>">
                <input type="text" name="txtWeb" values="<%= c.getWeb()%>">
                <input type="text" name="txtRector"values="<%= c.getRector()%>">
                <input type="text" name="txtTelefono" values="<%= c.getTelefono()%>">
                <input type="text" name="txtCiudad" values="<%= c.getCiudad()%>">
                <input type="text" name="txtNumCarreras" values="<%= c.getNumCarreras()%>">
                <input type="text" name="txtNumSedes" values="<%= c.getNumSedes()%>">
                <input type="hidden" name="txtId" >
                <input type="submit" name="Actualizar">
            </form>
        </div>
    </body>
</html>
