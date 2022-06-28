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

        <title> Nuevo </title>
    </head>
    <body>
        <div class="container">
            <h1>Formulario de Informe </h1>
            <jsp:include page="META-INF/menu.jsp"> 
                <jsp:param name="opcion" value="informe" />
            </jsp:include>
            <br>
            <form action="InformeControlador" method="post">
                <input type="hidden" name="idIn" value="${informe.idIn}">

                <div class="form-group">
                    <label for="" class="form-label">Socio</label>
                    <select name="socioid" class="form-control" id="us">
                        <option value=""> Seleccione el apellido paterno</option>
                        <c:forEach var="item" items="${lista_socios}">
                            <option value="${item.idSo}"
                                    <c:if test="${Informe.sociosid == item.idSo}">
                                        selected
                                    </c:if>
                                    >${item.apaterno}</option>
                        </c:forEach>                                                
                    </select>
                    <select name="sociosid" class="form-control" id="us">
                        <option value=""> Seleccione el apellido materno</option>
                        <c:forEach var="item" items="${lista_socios}">
                            <option value="${item.idSo}"
                                    <c:if test="${Informe.sociosid == item.idSo}">
                                        selected
                                    </c:if>
                                    >${item.amaterno}</option>
                        </c:forEach>                                                
                    </select>

                    <select name="socioid" class="form-control" id="us">
                        <option value=""> Seleccione el nombre </option>
                        <c:forEach var="item" items="${lista_socios}">
                            <option value="${item.idSo}"
                                    <c:if test="${Informe.sociosid == item.idSo}">
                                        selected
                                    </c:if>
                                    >${item.nombres}</option>
                        </c:forEach>                                                
                    </select>

                </div>
                <div class="form-group">
                    <label for="" class="form-label">Cargo</label>              
                    <select name="cargoid" class="form-control" id="us">
                        <option value=""> Seleccione el cargo </option>
                        <c:forEach var="item" items="${lista_cargo}">
                            <option value="${item.idCa}"
                                    <c:if test="${Informe.cargosid == item.idCa}">
                                        selected
                                    </c:if>
                                    >${item.ncargo}</option>
                        </c:forEach>                                                
                    </select>  
                </div>
                
                
                <div class="form-group">
                    <label for="" class="form-label">Reporte</label>

                    <select name="repoid" class="form-control" id="us">
                        <option value=""> Seleccione la cantidad de semana </option>
                        <c:forEach var="item" items="${lista_reportecoo}">
                            <option value="${item.idRe}"
                                    <c:if test="${Informe.repoid == item.idRe}">
                                        selected
                                    </c:if>
                                    >${item.gsemana}</option>
                        </c:forEach>                                                
                    </select>
                    
                    
                    <select name="repoid" class="form-control" id="us">
                        <option value=""> Seleccione la fecha  </option>
                        <c:forEach var="item" items="${lista_reportecoo}">
                            <option value="${item.idRe}"
                                    <c:if test="${Informe.repoid == item.idRe}">
                                        selected
                                    </c:if>
                                    >${item.fecha}</option>
                        </c:forEach>                                                
                    </select>
                    
                    <select name="repoid" class="form-control" id="us">
                        <option value=""> Seleccione la hora</option>
                        <c:forEach var="item" items="${lista_reportecoo}">
                            <option value="${item.idRe}"
                                    <c:if test="${Informe.repoid == item.idRe}">
                                        selected
                                    </c:if>
                                    >${item.hora}</option>
                        </c:forEach>                                                
                    </select>
                    
                    <select name="repoid" class="form-control" id="us">
                        <option value=""> Seleccione el lugar</option>
                        <c:forEach var="item" items="${lista_reportecoo}">
                            <option value="${item.idRe}"
                                    <c:if test="${Informe.repoid == item.idRe}">
                                        selected
                                    </c:if>
                                    >${item.lugar}</option>
                        </c:forEach>                                                
                    </select>
                </div>   
                <div class="mb-3">
                    <label for="" class="form-label">Fecha</label>
                    <input type="text" class="form-control" name="fecha" value="${informe.finf}" placeholder="Escriba la fecha">

                </div>
                <button type="submit" class="btn btn-primary">Enviar</button>

            </form>
        </div>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>


    </body>
</html>