
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
            <h1>Formulario de Socios </h1>
            <jsp:include page="META-INF/menu.jsp"> 
                <jsp:param name="opcion" value="socios" />
            </jsp:include>
            <br>
            <form action="SociosControlador" method="post">
                <input type="hidden" name="idSo" value="${socios.idSo}">
                <div class="mb-3">
                    <label for="" class="form-label">Apaterno</label>
                    <input type="text" class="form-control" name="apaterno" value="${socios.apaterno}" placeholder="Escriba el apellido paterno">
                </div>
                
                <div class="mb-3">
                    <label for="" class="form-label">Amaterno</label>
                    <input type="text" class="form-control" name="amaterno" value="${socios.amaterno}" placeholder="Escriba el apellido materno">
                </div>
                
                <div class="mb-3">
                    <label for="" class="form-label">Nombres</label>
                    <input type="text" class="form-control" name="nombres" value="${socios.nombres}" placeholder="Escriba el/los nombres ">
                </div>
                
                <div class="mb-3">
                    <label for="" class="form-label">fnac</label>
                    <input type="text" class="form-control" name="fnac" value="${socios.fnac}" placeholder="Escriba la fecha de nacimiento">
                </div>
                
                <div class="mb-3">
                    <label for="" class="form-label">ci</label>
                    <input type="text" class="form-control" name="ci" value="${socios.ci}" placeholder="Escriba elcarnet de identidad">
                </div>
                
                <div class="mb-3">
                    <label for="" class="form-label">Celular</label>
                    <input type="text" class="form-control" name="celular" value="${socios.celular}" placeholder="Escriba el numero de celular">
                </div>
                
                <div class="mb-3">
                    <label for="" class="form-label">Correo</label>
                    <input type="text" class="form-control" name="correo" value="${socios.correo}" placeholder="Escriba el correo">
                </div>
                
                <button type="submit" class="btn btn-primary">Enviar</button>

            </form>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    </body>
</html>

