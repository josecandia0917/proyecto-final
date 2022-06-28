<%
    String opcion = request.getParameter("opcion");
%>    
            <ul class="nav nav-tabs">
                <li class="nav-item">
                    <a class="nav-link <%= (opcion.equals("cargo") ? "active" : "")%>"  href="CargoControlador">CARGOS</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link <%= (opcion.equals("gestion") ? "active" : "")%>"" href="GestionControlador">GESTIONES</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link <%= (opcion.equals("historial") ? "active" : "")%>"" href="HistorialControlador">HISTORIAL</a>
                </li>    
                <li class="nav-item">
                    <a class="nav-link <%= (opcion.equals("socios") ? "active" : "")%>"" href="SociosControlador">SOCIOS</a>
                </li> 
                <li class="nav-item">
                    <a class="nav-link <%= (opcion.equals("reportecoo") ? "active" : "")%>"" href="ReportecooControlador">REPORTECOO</a>
                </li> 
                <li class="nav-item">
                    <a class="nav-link <%= (opcion.equals("Informe") ? "active" : "")%>"" href="InformeControlador">INFORME</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link <%= (opcion.equals("usuario") ? "active" : "")%>"" href="UsuariosControlador">USUARIOS</a>
                </li> 
            </ul>  
