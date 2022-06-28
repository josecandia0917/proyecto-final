<%
    if(session.getAttribute("login") !="OK"){
        response.sendRedirect("login.jsp");
    }
%>
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

        <title> Punto de registros </title>
        <style>
            @import url('https://fonts.googleapis.com/css2?family=Bebas+Neue&family=Open+Sans:ital,wght@0,600;1,400&family=Petemoss&family=Raleway:wght@300;400;700&family=Yuji+Boku&display=swap');

            :root{
                --background: linear-gradient(135deg, #667eea7e 0%, #764ba298 100%);
                --colo-primary: #667eea ;
                --colo-secondary: #764ba2 ;
                --boton--padding: 20px 40px
            }

            body{
                font-family: 'Bebas Neue', cursive;
                font-family: 'Open Sans', sans-serif;
                font-family: 'Petemoss', cursive;
                font-family: 'Raleway', sans-serif;

            }

            .container{
                width: 90%; 
                margin:0 auto; 
                overflow: hidden;
                padding: 80px ;
                max-width: 1200px ;
            }

            .subtitle{
                color: var(--colo-primary) ;
                font-size:2.5rem ;
                margin-bottom: 35px;
            }

            .hero{
                height: 100vh;
                background-image: var(--background), url(https://media.istockphoto.com/photos/miner-in-the-mine-welluniformed-miner-inside-mine-raising-thumb-picture-id1221055720?k=20&m=1221055720&s=612x612&w=0&h=w6mEMt9XxoBPglfVcH7ROLQ4vJ1mz4UPo38FY1L5BSM=);
                background-repeat: no-repeat;
                background-size: cover;
                background-attachment: fixed;
                background-position: center;
                position: relative;
            }

            .hero .container{
                padding: o;
            }

            .nav{
                display: flex;
                justify-content: flex-end;
                height: 70px;
                align-items: center;
                font-weight: 700;
            }

            .nav--footer{
                font-weight: 300;
                justify-content: flex-start;
            }

            .nav__items{
                color: #fff;
                text-decoration: none;
                margin-right: 20px;
                padding: 10px 15px;
                font-weight: inherit;
            }

            .nav__items--cta{
                border:1px solid #fff;
            }

            .nav__items--footer{
                padding: 10px;
            }

            .hero__conteiner{
                display: flex;
                height: calc(100vh - 70px); 
                align-items: center;
                color: #fff;
            }

        </style>
    </head>
    <body>
        <header class="hero">

            <div class="container">
                <div class="container">
                    <<div class="container">
                        <h1>Bienvenidos a la pagina de registros de la Cooperativa los Descendientes</h1>
                        <jsp:include page="META-INF/menu.jsp"> 
                            <jsp:param name="opcion" value="cargo" />
                        </jsp:include>
                        <br>

                        <br>

                        <a href="index.jsp" class="btn btn-danger"><i class="fa-solid fa-door-closed"></i>Volver a la pagina</a>

                        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
                    </div>

                </div>
            </div>

            <div class="hero__wave" style=" overflow: hidden;" ><svg viewBox="0 0 500 150" preserveAspectRatio="none" style="height: 100%; width: 100%;"><path d="M0.00,49.99 C150.00,150.00 349.20,-49.99 500.00,49.99 L500.00,150.00 L0.00,150.00 Z" style="stroke: none; fill: #fff;"></path></svg></div>
        </header>

    </body>

</html>

