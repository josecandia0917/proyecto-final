
package com.emergentes.controlador;

import com.emergentes.dao.CargoDAOimpl;
import com.emergentes.dao.CargoDao;
import com.emergentes.modelo.Cargo;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "CargoControlador", urlPatterns = {"/CargoControlador"})
public class CargoControlador extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
            Cargo car = new Cargo();
            int idCa;
            CargoDao dao = new CargoDAOimpl();
            String action = (request.getParameter("action")!= null) ? request.getParameter("action"): "view";
            
            switch (action){
                case "add":
                    request.setAttribute("cargo", car);
                    request.getRequestDispatcher("frmcargo.jsp").forward(request, response);
                break;
                case "edit":
                    idCa = Integer.parseInt(request.getParameter("idCa"));
                    car = dao.getById(idCa);
                    request.setAttribute("cargo", car);
                    request.getRequestDispatcher("frmcargo.jsp").forward(request, response);
                break;
                case "delete":
                     idCa = Integer.parseInt(request.getParameter("idCa"));
                     dao.delete(idCa);
                     response.sendRedirect("CargoControlador");
                break;
                case "view":
                    // obtener la lista de registro 
                    List<Cargo> lista = dao.getAll();
                    request.setAttribute("cargo", lista);
                    request.getRequestDispatcher("cargo.jsp").forward(request, response);
                break;
            }
            
        }catch(Exception ex){
            System.out.println("Error " + ex.getMessage());
        }
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int idCa = Integer.parseInt(request.getParameter("idCa"));
        String ncargo = request.getParameter("ncargo");
        
        Cargo car  = new Cargo();
        
        car.setIdCa(idCa);
        car.setNcargo(ncargo);
        
        
        CargoDao dao = new CargoDAOimpl();
        if(idCa == 0){
            try {
                // nuevo registro

                dao.insert(car);
            } catch (Exception ex) {
                System.out.println("Error al insertar " +ex.getMessage());
            }
        }else {
            try {
                // ediciion
                dao.update(car);
            } catch (Exception ex) {
               System.out.println("Error al editar " +ex.getMessage());
            }
        }
        response.sendRedirect("CargoControlador");
    }
      
    }


