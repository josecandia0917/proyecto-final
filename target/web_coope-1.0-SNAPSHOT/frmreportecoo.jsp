
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
            <h1>Formulario de reporte cooperativa </h1>
            <jsp:include page="META-INF/menu.jsp"> 
                <jsp:param name="opcion" value="reportecoo" />
            </jsp:include>
            <br>
            <form action="ReportecooControlador" method="post">
                <input type="hidden" name="idRe" value="${reportecoo.idRe}">
                <div class="mb-3">
                    <label for="" class="form-label">Gsemana</label>
                    <input type="text" class="form-control" name="gsemana" value="${reportecoo.gsemana}" placeholder="Escriba la cantidad de la semana">
                </div>
                
                <div class="mb-3">
                    <label for="" class="form-label">Fecha</label>
                    <input type="text" class="form-control" name="fecha" value="${reportecoo.fecha}" placeholder="Escriba la fecha">
                </div>
                
                <div class="mb-3">
                    <label for="" class="form-label">Hora</label>
                    <input type="text" class="form-control" name="hora" value="${reportecoo.hora}" placeholder="Escriba la hora ">
                </div>
                
                <div class="mb-3">
                    <label for="" class="form-label">Lugar</label>
                    <input type="text" class="form-control" name="lugar" value="${reportecoo.lugar}" placeholder="Escriba el lugar">
                </div>
                
                <button type="submit" class="btn btn-primary">Enviar</button>

            </form>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    </body>
</html>


