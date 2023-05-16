<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
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
            <h1>Registros</h1>
            <a href="Controlador?accion=Agregar">Nuevo Registro</a>
            <table border="1">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>clave</th>
                        <th>nombre</th>
                        <th>categoria</th>
                        <th>web</th>
                        <th>rector</th>
                        <th>telefono</th>
                        <th>ciudad</th>
                        <th>numCarreras</th>
                        <th>numSedes</th>
                    </tr>
                </thead>
                <%
                    Usuario_dao dao = new Usuario_dao();
                    List<usuario>list =dao.listar();
                    Iterator<usuario>iterator=list.iterator();
                    usuario usu = null;
                    while(iterator.hasNext()){
                    usu=iterator.next();
                    
                    
                    
                    
                    
                    %>
                <tbody>
                    <tr>
                        <td><%= usu.getId()%></td>
                        <td><%= usu.getClave()%></td>
                        <td><%= usu.getNombre()%></td>
                        <td><%= usu.getCategoria()%></td>
                        <td><%= usu.getWeb()%></td>
                        <td><%= usu.getRector()%></td>
                        <td><%= usu.getTelefono()%></td>
                        <td><%= usu.getCiudad()%></td>
                        <td><%= usu.getNumCarreras()%></td>
                        <td><%= usu.getNumSedes()%></td>
                        <td> <a href="Controlador?accion=Editar&Id<%= usu.getId()%>">Editar</td>
                        <td> <a href="Controlador?accion=Eliminar&Id<%= usu.getId()%>">Eliminar</td>
                    </tr>
                </tbody>
            </table>

        </div>
        
    </body>
</html>
