
package com.emergentes.dao;

import com.emergentes.modelo.Reportecoo;
import com.emergentes.utiles.ConexionDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class ReporteDOAimpl extends ConexionDB implements ReportecooDAO{

    @Override
    public void insert(Reportecoo reportecoo) throws Exception {
        try {
            this.conectar();
            String sql = "INSERT INTO ReporteCoo (gsemana,fecha,hora,lugar) VALUES (?,?,?,?)";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setString(1, reportecoo.getGsemana());
            ps.setString(2, reportecoo.getFecha());
            ps.setString(3, reportecoo.getHora());
            ps.setString(4, reportecoo.getLugar());
      
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }

    @Override
    public void update(Reportecoo reportecoo) throws Exception {
        try {
            this.conectar();
            String sql = "UPDATE ReporteCoo SET gsemana=?,fecha=?,hora=?,lugar=? where idRe=?";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setString(1, reportecoo.getGsemana());
            ps.setString(2, reportecoo.getFecha());
            ps.setString(3, reportecoo.getHora());
            ps.setString(4, reportecoo.getLugar());
            ps.setInt(5, reportecoo.getIdRe());
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }

    @Override
    public void delete(int idRe) throws Exception {
        try {
            this.conectar();
            String sql = "DELETE FROM ReporteCoo WHERE idRe = ? ";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setInt(1, idRe);
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }

    @Override
    public Reportecoo getById(int idRe) throws Exception {
        
         Reportecoo rep = new Reportecoo();
         try {
            this.conectar();
            String sql = "SELECT * FROM ReporteCoo Where idRe = ? ";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setInt(1, idRe);
            
            
            ResultSet rs =  ps.executeQuery();
            if(rs.next()){
                rep.setIdRe(rs.getInt("idRe"));
                rep.setGsemana(rs.getString("gsemana"));
                rep.setFecha(rs.getString("fecha"));
                rep.setHora(rs.getString("hora"));
                rep.setLugar(rs.getString("lugar"));
            }
           
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
        return rep;
    }

    @Override
    public List<Reportecoo> getAll() throws Exception {
        
        List<Reportecoo> lista = null;
        try{
           this.conectar();
            PreparedStatement ps = this.conn.prepareStatement("SELECT * FROM ReporteCoo");

            ResultSet rs =  ps.executeQuery();
            
            lista = new ArrayList<Reportecoo>();
            
            while(rs.next()){
                
                Reportecoo rep = new Reportecoo();
                
                rep.setIdRe(rs.getInt("idRe"));
                rep.setGsemana(rs.getString("gsemana"));
                rep.setFecha(rs.getString("fecha"));
                rep.setHora(rs.getString("hora"));
                rep.setLugar(rs.getString("lugar"));
                
                lista.add(rep);
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
