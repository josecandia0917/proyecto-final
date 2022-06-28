<%
    if(session.getAttribute("login") !="OK"){
        response.sendRedirect("login.jsp");
    }
%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="es">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css" rel="stylesheet">
        <!-- Bootstrap CSS -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

        <title> GESTION </title>
    </head>
    <body>
        <div class="container">
            <h1> GESTION </h1>
            <jsp:include page="META-INF/menu.jsp"> 
                <jsp:param name="opcion" value="gestion" />
            </jsp:include>
            <br>
            <a href="GestionControlador?action=add" class="btn btn-primary btn-sm"><i class="fa-solid fa-circle-plus"></i> Nuevo </a>
            <br>
            <table class="table table-striped">
                <tr>
                    <th>ID</th>
                    <th>Año</th>
                    <th></th>
                    <th></th>
                </tr>
                <c:forEach var="item" items="${gestion}">
                    <tr>
                    <td>${item.idGe}</td>
                    <td>${item.gestion}</td>
                    <td><a href="GestionControlador?action=edit&idGe=${item.idGe}"><i class="fa-solid fa-pen-to-square"></i></a></td>
                    <td><a href="GestionControlador?action=delete&idGe=${item.idGe}" onclick="return(confirm('ESTA SEGURO DE ELIMINAR ????'))">
                            <i class="fa-solid fa-delete-left"></i>
                        </a>
                    </td>
                </tr>
                </c:forEach>
            </table>
            <a href="Logout" class="btn btn-danger"><i class="fa-solid fa-door-closed"></i>Cerrae sesion</a>
        </div>
    
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>


    </body>
</html>