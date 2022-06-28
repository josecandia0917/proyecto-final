
package com.emergentes.controlador;

import com.emergentes.dao.HistorialDAO;
import com.emergentes.dao.HistorialDAOimpl;
import com.emergentes.modelo.Historial;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "HistorialControlador", urlPatterns = {"/HistorialControlador"})
public class HistorialControlador extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
            Historial his = new Historial();
            int idHi;
            HistorialDAO dao = new HistorialDAOimpl();
            String action = (request.getParameter("action")!= null) ? request.getParameter("action"): "view";
            
            switch (action){
                case "add":
                    request.setAttribute("historial", his);
                    request.getRequestDispatcher("frmhistorial.jsp").forward(request, response);
                break;
                case "edit":
                    idHi = Integer.parseInt(request.getParameter("idHi"));
                    his = dao.getById(idHi);
                    request.setAttribute("historial", his);
                    request.getRequestDispatcher("frmhistorial.jsp").forward(request, response);
                break;
                case "delete":
                     idHi = Integer.parseInt(request.getParameter("idHi"));
                     dao.delete(idHi);
                     response.sendRedirect("HistorialControlador");
                break;
                case "view":
                    // obtener la lista de registro 
                    List<Historial> lista = dao.getAll();
                    request.setAttribute("historial", lista);
                    request.getRequestDispatcher("historial.jsp").forward(request, response);
                break;
            }
            
        }catch(Exception ex){
            System.out.println("Error " + ex.getMessage());
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int idHi = Integer.parseInt(request.getParameter("idHi"));
        String ingreso = request.getParameter("ingreso");
        String aporte = request.getParameter("aporte");
        String participaciones = request.getParameter("participaciones");
        
        Historial his  = new Historial();
        
        his.setIdHi(idHi);
        his.setIngreso(ingreso);
        his.setAporte(aporte);
        his.setParticipaciones(participaciones);
        
        
        HistorialDAO dao = new HistorialDAOimpl();
        if(idHi == 0){
            try {
                // nuevo registro

                dao.insert(his);
            } catch (Exception ex) {
                System.out.println("Error al insertar " +ex.getMessage());
            }
        }else {
            try {
                // ediciion
                dao.update(his);
            } catch (Exception ex) {
               System.out.println("Error al editar " +ex.getMessage());
            }
        }
        response.sendRedirect("HistorialControlador");
    }
}
