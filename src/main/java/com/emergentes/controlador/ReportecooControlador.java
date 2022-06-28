
package com.emergentes.controlador;

import com.emergentes.dao.ReporteDOAimpl;
import com.emergentes.dao.ReportecooDAO;
import com.emergentes.modelo.Reportecoo;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ReportecooControlador", urlPatterns = {"/ReportecooControlador"})
public class ReportecooControlador extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         try{
            Reportecoo rep = new Reportecoo();
            int idRe;
            ReportecooDAO dao = new ReporteDOAimpl();
            String action = (request.getParameter("action")!= null) ? request.getParameter("action"): "view";
            
            switch (action){
                case "add":
                    request.setAttribute("reportecoo", rep);
                    request.getRequestDispatcher("frmreportecoo.jsp").forward(request, response);
                break;
                case "edit":
                    idRe = Integer.parseInt(request.getParameter("idRe"));
                    rep = dao.getById(idRe);
                    request.setAttribute("reportecoo", rep);
                    request.getRequestDispatcher("frmreportecoo.jsp").forward(request, response);
                break;
                case "delete":
                     idRe = Integer.parseInt(request.getParameter("idRe"));
                     dao.delete(idRe);
                     response.sendRedirect("ReportecooControlador");
                break;
                case "view":
                    // obtener la lista de registro 
                    List<Reportecoo> lista = dao.getAll();
                    request.setAttribute("reportecoo", lista);
                    request.getRequestDispatcher("reportecoo.jsp").forward(request, response);
                break;
            }
            
        }catch(Exception ex){
            System.out.println("Error " + ex.getMessage());
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        int idRe = Integer.parseInt(request.getParameter("idRe"));
        String gsemana = request.getParameter("gsemana");
        String fecha = request.getParameter("fecha");
        String hora = request.getParameter("hora");
        String lugar = request.getParameter("lugar");
        
        Reportecoo rep  = new Reportecoo();
        
        rep.setIdRe(idRe);
        rep.setGsemana(gsemana);
        rep.setFecha(fecha);
        rep.setHora(hora);
        rep.setLugar(lugar);
        
        
        
        
        ReportecooDAO dao = new ReporteDOAimpl();
        if(idRe == 0){
            try {
                // nuevo registro

                dao.insert(rep);
            } catch (Exception ex) {
                System.out.println("Error al insertar " +ex.getMessage());
            }
        }else {
            try {
                // ediciion
                dao.update(rep);
            } catch (Exception ex) {
               System.out.println("Error al editar " +ex.getMessage());
            }
        }
        response.sendRedirect("ReportecooControlador");
    }


}
