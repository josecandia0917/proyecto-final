
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
        <title>web cooperativa</title>
        <!-- <title> BIENVENIDOS A LA PAGINA DE REGISTRO DE LA COOPERATIVA "TAJARUNA"</title>--> 
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
                background-image: var(--background), url(https://www.nueva-iso-14001.com/wp-content/uploads/2018/04/certificaci%C3%B3n-ISO-14001.jpg);
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

            .hero__texts{
                width: 80%;
                margin-bottom: 50px;
            }

            .hero__title{
                font-size: 3.2rem;
            }

            .hero__subtitle{
                font-size: 2rem;
                font-weight: 300;
                margin: 15px 0;
            }

            .hero__cta{
                display: inline-block;
                background: #fff;
                padding: var(--boton--padding);
                color: var(--colo-primary);
                text-decoration: none;
                border-radius: 40px;
            }

            .hero__wave{
                position: absolute;
                bottom: 0;
                left: 0;
                width: 100%;
                height: 100px;
            }

            /* About */

            .presentation{
                padding: 0;
                text-align: center;
            }

            .presentation__picture{
                width: 150px;
                height: 150px;
                border-radius: 50%;
                margin-bottom: 10px;
                object-fit: cover;
                object-position: top ;
            }



            .presentation__copy{
                width: 80%;  
                margin: 0 auto;  
            }

            .presentation__cta{
                display: inline-block;
                margin-top: 30px;
                background: var(--colo-primary);
                color: #fff;
                text-decoration: none;
                padding: var(--boton--padding);
                border-radius: 40px;
            }

            .about{
                min-height: 400px;
                display: grid;
                grid-template-columns: 1fr 1fr;
                row-gap:80px ;
                justify-items: center;
                align-items: center;
            }

            .about__img{
                text-align: center;
            }

            .about__img--left{
                text-align: left; 
            }

            .about__picture{
                max-width: 80%;
            }

            .about__paragraph{
                margin-bottom: 20px;
                line-height: 1.5;
                font-weight: 300;
            }

            /* Projects */

            .projects{
                background: #f2f2f2; 
            }

            .projects__grid{
                display: grid;
                height: 550px;
                grid-template-areas: 
                    " https://www.ccmss.org.mx/wp-content/uploads/2019/02/industry-2023592_1280-1.jpg "
                   ;
                gap: 10px;
            }

            .proyects__item{
                position: relative;
                width: 100%;
                height: 100%;
                overflow: hidden;
            }

            .projects__img{
                width: 100%;
                height: 100%;
                object-fit: cover;
                cursor: pointer;
            }

            .proyects__item:nth-of-type(1){
                grid-area: img1;
            }

            .proyects__item:nth-of-type(2){
                grid-area: img2;
            }

            .proyects__item:nth-of-type(3){
                grid-area: img3;
            }

            .proyects__item:nth-of-type(4){
                grid-area: img4;
            }

            .proyects__item:nth-of-type(5){
                grid-area: img5;
            }

            .proyects__item:nth-of-type(6){
                grid-area: img6;
            }

            .projects__hover{
                position: absolute;
                background-color: #dc143c8c;
                top: 0;
                left: 0;
                width: 100%;
                height: 100%;
                color: #fff;
                text-align: center;
                display: flex;
                flex-direction: column;
                justify-content: center;
                transform: translateX(100%);
                cursor: pointer;
                transition: transform .3s ease-in-out;
            }

            .proyects__item:hover .projects__hover{
                transform: translateX(0%);
            }

            .projects__icon{
                margin-top: 10px;
                font-size: 30px;
            }

            /* testimony  */

            .testimony__grid{
                width: 100%;
                display: grid;
                grid-template-columns: 1fr 1fr ;
                gap: 30px;
            }

            .testimony__item{
                width: 95%;
                margin: auto;
                background: var(--colo-secondary);
                box-shadow: 0 8px 10px rgba(66,66,66,.5);
                border-radius: 7px;
                padding: 30px 25px;
                color: #fff;
                margin-bottom: 50px;
            }

            .testimony__person{
                display: flex;
                align-items: center;
                margin-bottom: 20px;
            }

            .testimony__img{
                width: 100px;
                min-width: 100px;
                height: 100px;
                object-fit: cover;
                object-position: top;
                border-radius: 50%;
                border: 3px solid #fff;
                margin-right: 30px;
            }

            .testimony__name{
                font-size: 1.5rem;
                margin-bottom: 10px;
            }

            .testimony__verification{
                color: #EAFAA0;
                font-weight: 700;

            }

            .testimony__review{
                font-weight: 300;
            }


            /* footer */

            .footer{
                background: var(--colo-primary);
            }

            .footer_grid{
                display: grid;
                grid-template-columns: 3fr 2fr;
                gap: 20px;
                align-items: center;
            }

            .footer__title{
                font-weight: 400;
                color: #fff;
                font-size: 2rem;
                margin-bottom: 30px;
                text-align: center;

            }

            .footer__icons{
                display: flex;
                justify-content: space-evenly;
            }

            .footer__container-icons{
                display: inline-block;
                width: 60px;
                height: 60px;
                color: #fff;
                text-align: center;
                border: 1px solid #fff;
                border-radius: 50%;  
            }

            .footer__icon{
                color: inherit;
                font-size: 30px;
                text-decoration: none; 


            }

            .fab.footer__icon{
                line-height: 60px;
            }


            /* responsive design */

            @media  screen and (max-width: 800px) {
                :root{
                    --boton--padding: 18px 40px
                }

                .nav{
                    justify-content: space-around;
                }

                .nav__items{
                    font-weight: 400;
                    border-bottom: 1px solid #fff;
                    margin-right: 0;
                }

                .nav__items--cta{
                    border: none;
                }

                .nav__items--footer{
                    border: none;
                }

                .hero__texts{
                    width: 100%;
                    margin-bottom: 80px;
                }

                .hero__title{
                    font-size: 2.5rem;
                }

                .hero__subtitle{
                    font-size: 1.5rem;
                }

                /* about */
                .presentation__copy{
                    width: 100%;
                }

                .about{
                    grid-template-columns: 1fr;
                }

                .about.container{
                    padding-top: 30px;
                }

                .about__img--left{
                    text-align: center;
                }

                .abaut_texts:last-child{
                    grid-row: 3/4;
                }

                /* my proyects*/

                .projects__grid{
                    grid-template-areas: 
                        "ima9" "ima9" "ima9" "ima9"
                        "ima9" "ima9" "ima9" "ima9"
                        "ima9" "ima9" "ima9" "ima9";
                }

                /* testimony */

                .testimony__grid{
                    grid-template-columns: 1fr;
                    gap: 30px;
                }


                /*  footer */
                .footer_grid{
                    grid-template-columns: 1fr;
                }

                .footer__contact{
                    grid-row: 1/2; 
                }

            }

            @media screen and (max-width: 500px){
                :root{
                    --boton--padding: 18px 35px
                }

                .subtitle{
                    font-size: 2rem;
                    margin-bottom: 20px;
                }

                .nav{
                    flex-wrap: wrap;
                    justify-content: space-evenly;
                    border: 0;
                }

                .nav__items{
                    padding: 0 10px;
                    border: 0;
                }

                .hero__texts{
                    text-align: center;
                    margin-bottom: 100px;

                }

                .hero__title{
                    font-size: 2rem;
                }

                /* about */
                .presentation__picture{
                    width: 120px;
                    height: 120px;
                }

                .about{
                    row-gap: 60px;
                }

                .about.container{
                    padding-top: 10px;
                }

                /* my proyects*/

                .projects__grid{
                    grid-template-areas: 
                        "ima9"
                        "ima9"
                        "ima9"
                        "ima9"
                        "ima9";
                    height: auto;
                    grid-template-rows: repeat(5, 250px);
                    grid-auto-rows: 250px;
                    gap: 10px;
                }


                /* testimony */

                .testimony__item{
                    padding: 30px 15px;
                }

                .testimony__person{
                    flex-direction: center;
                }

                .testimony__texs{
                    text-align: center;
                }

                .testimony__img{
                    margin: 0;
                    margin-bottom: 20px;
                }


            }
        </style>
    </head>
    <body>
        
    </body>
    <header class="hero">

        <div class="container">
            <nav class="nav">
                <a href="login.jsp" class="nav__items nav__items--cta" id="registrate">Registros de la cooperativa</a>
                <a href="#info" class="nav__items">Sobre nosotros</a>
                <a href="#fotos" class="nav__items">Fotos Destacadas</a>
            </nav>

            <section class="hero__conteiner">
                <div class="hero__texts">
                    <nav class=" nav--footer">
                        <h1 class="here__title">Cooperativa los Descendientes</h1>
                        <h2 class="hero__subtitle">Conocemos y descubre por que invertir con nosotros</h2>
                        <a href="#" class="hero__cta">Cantactanos</a>
                    </nav>
                </div>
            </section>

        </div>

        <div class="hero__wave" style=" overflow: hidden;" ><svg viewBox="0 0 500 150" preserveAspectRatio="none" style="height: 100%; width: 100%;"><path d="M0.00,49.99 C150.00,150.00 349.20,-49.99 500.00,49.99 L500.00,150.00 L0.00,150.00 Z" style="stroke: none; fill: #fff;"></path></svg></div>
    </header>

    <main>
        <section class="presentation container">
            <img src="https://gestion.pe/resizer/aTuqmFBTCTt235-BG3VN7NukSyU=/580x330/smart/filters:format(jpeg):quality(75)/arc-anglerfish-arc2-prod-elcomercio.s3.amazonaws.com/public/3NVOTG5CARGQHH326NZJSCRDBU.jpg" class="presentation__picture">
            <h2 class="subtitle"> Cooperativa los Descendientes</h2>
            <p class="presentation__copy">
                Lorem, ipsum dolor sit amet consectetur adipisicing elit. Odio fuga nihil dicta corporis harum tempora pariatur, laudantium quo facilis eius obcaecati esse vero explicabo modi, provident illo dolorum eaque ducimus?
            </p>
            <a href="#" class="presentation__cta"> Contactanos Ahora</a>
        </section>

        <section class="about container">
            <div class="about__texts">
                <h2 class="subtitle" id="presentacion">Presentacion</h2>
                <p class="about__paragraph">
                    Lorem ipsum dolor sit amet consectetur adipisicing elit. At velit explicabo similique, dolore fugit, earum accusamus vero repellat molestias iusto reprehenderit tempore commodi placeat quas voluptatibus obcaecati magnam. Temporibus, eos?
                </p>
                <p class="about__paragraph">
                    Lorem ipsum dolor sit amet consectetur adipisicing elit. At velit explicabo similique, dolore fugit, earum accusamus vero repellat molestias iusto reprehenderit tempore commodi placeat quas voluptatibus obcaecati magnam. Temporibus, eos?
                </p>
            </div>
            <figure class="about__img">
                <img src="https://www.noticiasfides.com/images/news/2022/03/c-mine-414544-14CD.jpg" class="about__picture">
            </figure>





            <div class="about__texts">
                <h2 class="subtitle" id="info">Sobre Nosotros</h2>
                <p class="about__paragraph">
                    Lorem ipsum dolor sit amet consectetur adipisicing elit. At velit explicabo similique, dolore fugit, earum accusamus vero repellat molestias iusto reprehenderit tempore commodi placeat quas voluptatibus obcaecati magnam. Temporibus, eos?
                </p>
                <p class="about__paragraph">
                    Lorem ipsum dolor sit amet consectetur adipisicing elit. At velit explicabo similique, dolore fugit, earum accusamus vero repellat molestias iusto reprehenderit tempore commodi placeat quas voluptatibus obcaecati magnam. Temporibus, eos?
                </p>
                <figure class="about__img about__img--left">
                    <img src="https://www.noticiasfides.com/images/news/2022/03/c-mine-414544-14CD.jpg" class="about__picture">
                </figure>
            </div>
        </section>

        <section class="projects" id="fotos">
            <div class="container">
                <h2 class="subtitle">Galeria</h2>
                <div class="projects__grid">
                    <article class="proyects__item">
                        <img src="https://gestion.pe/resizer/CwVlTYT9bJSyylLA4vmNFSg3OOo=/980x0/smart/filters:format(jpeg):quality(75)/arc-anglerfish-arc2-prod-elcomercio.s3.amazonaws.com/public/XNL42JFMMVFKTCSBN2GSM2QRUI.jpg" class="projects__img" height="100" width="150">
                        <div class="projects__hover">
                            <h2 class="projects__title">fotos</h2> 
                            <i class="fas fa-camera projects__icon"></i>
                        </div>
                    </article>

                    <article class="proyects__item">
                        <img src="https://www.ccmss.org.mx/wp-content/uploads/2019/02/industry-2023592_1280-1.jpg" class="projects__img">
                        <div class="projects__hover">
                            <h2 class="projects__title">fotos</h2> 
                            <i class="fas fa-camera projects__icon"></i>
                        </div>
                    </article>

                    <article class="proyects__item">
                        <img src="imagenes/img3.jpg" class="projects__img">
                        <div class="projects__hover">
                            <h2 class="projects__title">fotos</h2> 
                            <i class="fas fa-camera projects__icon"></i>
                        </div>
                    </article>

                    <article class="proyects__item">
                        <img src="imagenes/img4.jpg" class="projects__img">
                        <div class="projects__hover">
                            <h2 class="projects__title">fotos</h2> 
                            <i class="fas fa-camera projects__icon"></i>
                        </div>
                    </article>

                    <article class="proyects__item">
                        <img src="imagenes/img5.jpg" class="projects__img">
                        <div class="projects__hover">
                            <h2 class="projects__title">fotos</h2> 
                            <i class="fas fa-camera projects__icon"></i>
                        </div>
                    </article>

                    <article class="proyects__item">
                        <img src="imagenes/img6.jpg" class="projects__img">
                        <div class="projects__hover">
                            <h2 class="projects__title">fotos</h2> 
                            <i class="fas fa-camera projects__icon"></i>
                        </div>
                    </article>

                </div>
            </div>
        </section>

        <section class="testimony container">
            <h2 class="subtitle">Que dicen de nosotros?</h2>

            <div class="testimony__grid">
                <article class="testimony__item">
                    <div class="testimony__person">
                        <img src="https://images.unsplash.com/photo-1608277565122-b8443a713f41?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=427&q=80" class="testimony__img" >
                        <div class="testimony__texs">
                            <h3 class="testimony__name">Lucia Barrera</h3>
                            <p class="testimony__verification">Visitante 1</p>
                        </div>
                    </div>
                    <p class="testimony__review">
                        Lorem ipsum dolor, sit amet consectetur adipisicing elit. A asperiores dolores facilis delectus molestiae quas porro veritatis et ex? Veritatis, ad voluptates odio fugiat cumque exercitationem minima? Mollitia, ipsum unde.
                    </p>
                </article> 

                <article class="testimony__item">
                    <div class="testimony__person">
                        <img src="https://images.unsplash.com/photo-1497551060073-4c5ab6435f12?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=426&q=80" class="testimony__img" >
                        <div class="testimony__texs">
                            <h3 class="testimony__name">Jose Candia</h3>
                            <p class="testimony__verification">Visitante 2</p>
                        </div>
                    </div>
                    <p class="testimony__review">
                        Lorem ipsum dolor, sit amet consectetur adipisicing elit. A asperiores dolores facilis delectus molestiae quas porro veritatis et ex? Veritatis, ad voluptates odio fugiat cumque exercitationem minima? Mollitia, ipsum unde.
                    </p>
                </article> 
            </div>
        </section>

    </main>

    <footer class="footer">
        <div class="container footer_grid">
            <nav class="nav nav--footer">
                <a href="registros.jsp" class="nav__items nav__items--footer ">Registros de la cooperativa</a> 
                <a href="#info" class="nav__items nav__items--footer">sobre nosotros</a>
                <a href="#presentacion" class="nav__items nav__items--footer">Presentacion</a>
                <a href="#fotos" class="nav__items nav__items--footer">fotos</a>
            </nav>

            <section class="footer__contact">
                <h3 class="footer__title">Visita nuestar redes sociales</h3> 
                <div class="footer__icons">
                    <span class="footer__container-icons">
                        <a class="fab fa-facebook-f footer__icon" href="https://es-la.facebook.com/"></a>
                    </span>

                    <span class="footer__container-icons">
                        <a class="fab fa-instagram footer__icon" href="https://www.instagram.com/?hl=es"></a>
                    </span>

                    <span class="footer__container-icons">
                        <a class="fab fa-whatsapp footer__icon" href="https://web.whatsapp.com/"></a>
                    </span>
                </div>
            </section>

        </div>
    </footer>




    <script src="https://kit.fontawesome.com/26de272c81.js" crossorigin="anonymous"></script>
</html>
