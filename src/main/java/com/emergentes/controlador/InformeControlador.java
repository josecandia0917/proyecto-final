
package com.emergentes.controlador;

import com.emergentes.dao.CargoDAOimpl;
import com.emergentes.dao.CargoDao;
import com.emergentes.dao.InformeDAO;
import com.emergentes.dao.InformeDAOimpl;
import com.emergentes.dao.ReporteDOAimpl;
import com.emergentes.dao.ReportecooDAO;
import com.emergentes.dao.SociosDAO;
import com.emergentes.dao.SociosDAOimpl;
import com.emergentes.modelo.Cargo;
import com.emergentes.modelo.Informe;
import com.emergentes.modelo.Reportecoo;
import com.emergentes.modelo.Socios;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "InformeControlador", urlPatterns = {"/InformeControlador"})
public class InformeControlador extends HttpServlet {


    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         System.out.println("INICIANDO informe...");
try{
            InformeDAO dao = new InformeDAOimpl();
            
            SociosDAO daoSocios = new SociosDAOimpl();
            CargoDao daoCargo = new CargoDAOimpl();
            ReportecooDAO daoReportecoo = new ReporteDOAimpl();
            
            //Para recibir el ID
            int idIn;
            
            List<Socios> lista_socios = null;
            List<Cargo> lista_cargo = null;
            List<Reportecoo> lista_reportecoo = null;
            
            // Gestionar Registros
            Informe inf = new Informe();
            
            String action = (request.getParameter("action") != null) ? request.getParameter("action") : "view";
            switch (action) {
                case "add":
                    lista_socios = daoSocios.getAll();
                    lista_cargo = daoCargo.getAll();
                    lista_reportecoo = daoReportecoo.getAll();
                    
                    request.setAttribute("lista_socios", lista_socios);
                    request.setAttribute("lista_cargo", lista_cargo);
                    request.setAttribute("lista_reportecoo", lista_reportecoo);
                    
                    request.setAttribute("informe", inf);
                    request.getRequestDispatcher("frminforme.jsp").forward(request, response);
                    break;
                    
                    
                case "edit":
                    //Editar Registro
                    idIn = Integer.parseInt(request.getParameter("idIn"));
                    inf = dao.getById(idIn);
                    
                    lista_socios = daoSocios.getAll();
                    lista_cargo = daoCargo.getAll();
                    lista_reportecoo = daoReportecoo.getAll();
                    
                    
                    request.setAttribute("lista_socios", lista_socios);
                    request.setAttribute("lista_cargo", lista_cargo);
                    request.setAttribute("lista_reportecoo", lista_reportecoo);
                    
                    
                    
                    request.setAttribute("informe", inf);
                    request.getRequestDispatcher("frminforme.jsp").forward(request, response);
                    break;
                    
                   
                case "delete":
                     //Eliminar Registro
                    idIn = Integer.parseInt(request.getParameter("idIn"));
                    dao.delete(idIn);
                    response.sendRedirect("InformeController");
                    break;
                case "view":
                    //Listar Registros
                    List<Informe> lista = dao.getAll();
                    request.setAttribute("informe", lista);
                    request.getRequestDispatcher("informe.jsp").forward(request, response);
                    break;
            }

        } catch (Exception ex) {
            System.out.println("Error " + ex.getMessage());
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int idIn = Integer.parseInt(request.getParameter("idIn"));
        int sociosid = Integer.parseInt(request.getParameter("sociosid"));
        int cargoid = Integer.parseInt(request.getParameter("cargoid"));
        int repoid = Integer.parseInt(request.getParameter("repoid"));
        String fecha = request.getParameter("fecha");
        
        Informe inf = new Informe();
        
        inf.setIdIn(idIn);
        inf.setSocioid(sociosid);
        inf.setCargoid(cargoid);
        inf.setRepoid(repoid);
        inf.setFinf(fecha);
        
        if(idIn == 0){
            // nuevo
                InformeDAO dao = new InformeDAOimpl();
            try {
                dao.insert(inf);
                response.sendRedirect("InformeControlador");
            } catch (Exception ex) {
                System.out.println("Error al insertar " +ex.getMessage());
            }
                
        }else{
            //editar
            InformeDAO dao = new InformeDAOimpl();
            try {
                dao.update(inf);
                response.sendRedirect("InformeControlador");
            } catch (Exception ex) {
                System.out.println("Error al editar " +ex.getMessage());
            }
    }

    
    }
}
