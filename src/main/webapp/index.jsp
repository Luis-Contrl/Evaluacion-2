<%-- 
    Document   : index
    Created on : 30-09-2023, 13:24:07
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Datos del cliente</h1>
        <form action="action" method="POST">
            <p><label>Id: </label><input type="text" id="Id" name="id"></p>
            <p><label>Nombre: </label><input type="text" id="Id" name="nombre"></p>
            <p><label>Apellido: </label><input type="text" id="Id" name="apellido"></p>
            <p><label>Telefono: </label><input type="text" id="Id" name="telefono"></p>
            <p><label>Correo: </label><input type="text" id="Id" name="correo"></p>           
            <button type="submit">enviar</button>
        </form>
    </body>
</html>
