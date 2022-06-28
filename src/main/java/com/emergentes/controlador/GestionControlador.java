
package com.emergentes.controlador;

import com.emergentes.dao.GestionDAO;
import com.emergentes.dao.GestionDAOimpl;
import com.emergentes.modelo.Gestion;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "GestionControlador", urlPatterns = {"/GestionControlador"})
public class GestionControlador extends HttpServlet {

    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         try{
            Gestion ges = new Gestion();
            int idGe;
            GestionDAO dao = new GestionDAOimpl();
            String action = (request.getParameter("action")!= null) ? request.getParameter("action"): "view";
            
            switch (action){
                case "add":
                    request.setAttribute("gestion", ges);
                    request.getRequestDispatcher("frmcargo.jsp").forward(request, response);
                break;
                case "edit":
                    idGe = Integer.parseInt(request.getParameter("idGe"));
                    ges = dao.getById(idGe);
                    request.setAttribute("gestion", ges);
                    request.getRequestDispatcher("frmgestion.jsp").forward(request, response);
                break;
                case "delete":
                     idGe = Integer.parseInt(request.getParameter("idGe"));
                     dao.delete(idGe);
                     response.sendRedirect("GestionControlador");
                break;
                case "view":
                    // obtener la lista de registro 
                    List<Gestion> lista = dao.getAll();
                    request.setAttribute("gestion", lista);
                    request.getRequestDispatcher("gestion.jsp").forward(request, response);
                break;
            }
            
        }catch(Exception ex){
            System.out.println("Error " + ex.getMessage());
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int idGe = Integer.parseInt(request.getParameter("idGe"));
        String gestion = request.getParameter("gestion");
        
        Gestion ges  = new Gestion();
        
        ges.setIdGe(idGe);
        ges.setGestion(gestion);
        
        
        GestionDAO dao = new GestionDAOimpl();
        if(idGe == 0){
            try {
                // nuevo registro

                dao.insert(ges);
            } catch (Exception ex) {
                System.out.println("Error al insertar " +ex.getMessage());
            }
        }else {
            try {
                // ediciion
                dao.update(ges);
            } catch (Exception ex) {
               System.out.println("Error al editar " +ex.getMessage());
            }
        }
        response.sendRedirect("GestionControlador");
    }
    }

    


