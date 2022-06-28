
package com.emergentes.dao;

import com.emergentes.modelo.Historial;
import com.emergentes.utiles.ConexionDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class HistorialDAOimpl extends ConexionDB implements HistorialDAO {
    

    @Override
    public void insert(Historial historial) throws Exception {
        try {
            this.conectar();
            String sql = "INSERT INTO historial (ingreso,aporte,participaciones) VALUES (?,?,?)";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setString(1, historial.getIngreso());
            ps.setString(2, historial.getAporte());
            ps.setString(3, historial.getParticipaciones());
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }

    @Override
    public void update(Historial historial) throws Exception {
        try {
            this.conectar();
            String sql = "UPDATE historial SET ingreso=?,aporte=?,participaciones=? where idHi=?";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setString(1, historial.getIngreso());
            ps.setString(2, historial.getAporte());
            ps.setString(3, historial.getParticipaciones());
            ps.setInt(4, historial.getIdHi());
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }

    @Override
    public void delete(int idHi) throws Exception {
        try {
            this.conectar();
            String sql = "DELETE FROM historial WHERE idHi = ? ";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setInt(1, idHi);
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }

    @Override
    public Historial getById(int idHi) throws Exception {
        Historial his = new Historial();
         try {
            this.conectar();
            String sql = "SELECT * FROM historial Where idHi = ? ";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setInt(1, idHi);
            
            
            ResultSet rs =  ps.executeQuery();
            if(rs.next()){
                his.setIdHi(rs.getInt("idHi"));
                his.setIngreso(rs.getString("ingreso"));
                his.setAporte(rs.getString("aporte"));
                his.setParticipaciones(rs.getString("participaciones"));
            }
           
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
        return his;
    }

    @Override
    public List<Historial> getAll() throws Exception {
        List<Historial> lista = null;
        try{
           this.conectar();
            PreparedStatement ps = this.conn.prepareStatement("SELECT * FROM historial");

            ResultSet rs =  ps.executeQuery();
            
            lista = new ArrayList<Historial>();
            
            while(rs.next()){
                Historial car = new Historial();
                car.setIdHi(rs.getInt("idHi"));
                car.setIngreso(rs.getString("ingreso"));
                car.setAporte(rs.getString("aporte"));
                car.setParticipaciones(rs.getString("participaciones"));
                
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
