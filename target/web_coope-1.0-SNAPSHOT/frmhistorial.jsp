
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

        <title> Nuevo </title>
    </head>
    <body>
        <div class="container">
            <h1>Formulario de Historial </h1>
            <jsp:include page="META-INF/menu.jsp"> 
                <jsp:param name="opcion" value="historial" />
            </jsp:include>
            <br>
            <form action="HistorialControlador" method="post">
                <input type="hidden" name="idHi" value="${historial.idHi}">
                <div class="mb-3">
                    <label for="" class="form-label">Ingreso</label>
                    <input type="text" class="form-control" name="ingreso" value="${historial.ingreso}" placeholder="Escriba el ingreso">
                </div>
                
                <div class="mb-3">
                    <label for="" class="form-label">Aporte</label>
                    <input type="text" class="form-control" name="aporte" value="${historial.aporte}" placeholder="Escriba el aporte">
                </div>
                
                <div class="mb-3">
                    <label for="" class="form-label">Participaciones</label>
                    <input type="text" class="form-control" name="participaciones" value="${historial.participaciones}" placeholder="Escriba la participacion">
                </div>
                
                <button type="submit" class="btn btn-primary">Enviar</button>

            </form>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    </body>
</html>
