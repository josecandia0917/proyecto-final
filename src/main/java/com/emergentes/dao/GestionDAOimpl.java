
package com.emergentes.dao;

import com.emergentes.modelo.Gestion;
import com.emergentes.utiles.ConexionDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class GestionDAOimpl extends ConexionDB implements GestionDAO {

    @Override
    public void insert(Gestion gestion) throws Exception {
        try {
            this.conectar();
            String sql = "INSERT INTO gestiones (gestion) VALUES (?)";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setString(1, gestion.getGestion());
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }

    @Override
    public void update(Gestion gestion) throws Exception {
        try {
            this.conectar();
            String sql = "UPDATE gestiones SET gestion=? where idGe=?";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setString(1, gestion.getGestion());
            ps.setInt(2, gestion.getIdGe());
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }

    @Override
    public void delete(int idGe) throws Exception {
        try {
            this.conectar();
            String sql = "DELETE FROM gestiones WHERE idGe = ? ";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setInt(1, idGe);
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }

    @Override
    public Gestion getById(int idGe) throws Exception {
        Gestion ges = new Gestion();
         try {
            this.conectar();
            String sql = "SELECT * FROM gestiones Where idGe = ? ";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setInt(1, idGe);
            
            
            ResultSet rs =  ps.executeQuery();
            if(rs.next()){
                ges.setIdGe(rs.getInt("idGe"));
                ges.setGestion(rs.getString("gestion"));
                
            }
           
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
        return ges;
    }

    @Override
    public List<Gestion> getAll() throws Exception {
         List<Gestion> lista = null;
        try{
           this.conectar();
            PreparedStatement ps = this.conn.prepareStatement("SELECT * FROM gestiones");

            ResultSet rs =  ps.executeQuery();
            
            lista = new ArrayList<Gestion>();
            
            while(rs.next()){
                Gestion car = new Gestion();
                car.setIdGe(rs.getInt("idGe"));
                car.setGestion(rs.getString("gestion"));
                
                lista.add(car);
            }
            rs.close();
            ps.close();
           
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
        return lista;
    }
    
}
