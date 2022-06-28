
package com.emergentes.controlador;

import com.emergentes.dao.SociosDAO;
import com.emergentes.dao.SociosDAOimpl;
import com.emergentes.modelo.Socios;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SociosControlador", urlPatterns = {"/SociosControlador"})
public class SociosControlador extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try{
            Socios sos = new Socios();
            int idSo;
            SociosDAO dao = new SociosDAOimpl();
            String action = (request.getParameter("action")!= null) ? request.getParameter("action"): "view";
            
            switch (action){
                case "add":
                    request.setAttribute("socios", sos);
                    request.getRequestDispatcher("frmsocios.jsp").forward(request, response);
                break;
                case "edit":
                    idSo = Integer.parseInt(request.getParameter("idSo"));
                    sos = dao.getById(idSo);
                    request.setAttribute("socios", sos);
                    request.getRequestDispatcher("frmsocios.jsp").forward(request, response);
                break;
                case "delete":
                     idSo = Integer.parseInt(request.getParameter("idSo"));
                     dao.delete(idSo);
                     response.sendRedirect("SociosControlador");
                break;
                case "view":
                    // obtener la lista de registro 
                    List<Socios> lista = dao.getAll();
                    request.setAttribute("socios", lista);
                    request.getRequestDispatcher("socios.jsp").forward(request, response);
                break;
            }
            
        }catch(Exception ex){
            System.out.println("Error " + ex.getMessage());
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        int idSo = Integer.parseInt(request.getParameter("idSo"));
        String apaterno = request.getParameter("apaterno");
        String amaterno = request.getParameter("amaterno");
        String nombres = request.getParameter("nombres");
        String fnac = request.getParameter("fnac");
        int ci = Integer.parseInt(request.getParameter("ci"));
        int celular = Integer.parseInt(request.getParameter("celular"));
        String correo = request.getParameter("correo");
        
        Socios sos  = new Socios();
        
        sos.setIdSo(idSo);
        sos.setApaterno(apaterno);
        sos.setAmaterno(amaterno);
        sos.setNombres(nombres);
        sos.setFnac(fnac);
        sos.setCi(ci);
        sos.setCelular(celular);
        sos.setCorreo(correo);
        
        
        
        
        SociosDAO dao = new SociosDAOimpl();
        if(idSo == 0){
            try {
                // nuevo registro

                dao.insert(sos);
            } catch (Exception ex) {
                System.out.println("Error al insertar " +ex.getMessage());
            }
        }else {
            try {
                // ediciion
                dao.update(sos);
            } catch (Exception ex) {
               System.out.println("Error al editar " +ex.getMessage());
            }
        }
        response.sendRedirect("SociosControlador");
    }
    }

