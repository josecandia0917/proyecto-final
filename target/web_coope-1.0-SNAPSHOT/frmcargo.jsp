
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
            <h1>Formulario de cargo </h1>
            <jsp:include page="META-INF/menu.jsp"> 
                <jsp:param name="opcion" value="cargo" />
            </jsp:include>
            <br>
            <form action="CargoControlador" method="post">
                <input type="hidden" name="idCa" value="${cargo.idCa}">
                <div class="mb-3">
                    <label for="" class="form-label">Nombre del cargo</label>
                    <input type="text" class="form-control" name="ncargo" value="${cargo.ncargo}" placeholder="Escriba el cargo">
                    
                </div>
                <button type="submit" class="btn btn-primary">Enviar</button>

            </form>
        </div>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>


    </body>
</html>