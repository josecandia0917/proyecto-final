
package com.emergentes.dao;

import com.emergentes.modelo.Socios;
import com.emergentes.utiles.ConexionDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class SociosDAOimpl extends ConexionDB implements SociosDAO{

    @Override
    public void insert(Socios socios) throws Exception {
        try {
            this.conectar();
            String sql = "INSERT INTO socios (apaterno,amaterno,nombres,fnac,ci,celular,correo) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setString(1, socios.getApaterno());
            ps.setString(2, socios.getAmaterno());
            ps.setString(3, socios.getNombres());
            ps.setString(4, socios.getFnac());
            ps.setInt(5, socios.getCi());
            ps.setInt(6, socios.getCelular());
            ps.setString(7, socios.getCorreo());
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }

    @Override
    public void update(Socios socios) throws Exception {
        try {
            this.conectar();
            String sql = "UPDATE socios SET apaterno=?,amaterno=?,nombres=?,fnac=?,ci=?,celular=?,correo=? where idSo=?";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setString(1, socios.getApaterno());
            ps.setString(2, socios.getAmaterno());
            ps.setString(3, socios.getNombres());
            ps.setString(4, socios.getFnac());
            ps.setInt(5, socios.getCi());
            ps.setInt(6, socios.getCelular());
            ps.setString(7, socios.getCorreo());
            ps.setInt(8, socios.getIdSo());
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }

    @Override
    public void delete(int idSo) throws Exception {
        try {
            this.conectar();
            String sql = "DELETE FROM socios WHERE idSo = ? ";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setInt(1, idSo);
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }

    @Override
    public Socios getById(int idSo) throws Exception {
        Socios sos = new Socios();
         try {
            this.conectar();
            String sql = "SELECT * FROM socios Where idSo = ? ";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setInt(1, idSo);
            
            
            ResultSet rs =  ps.executeQuery();
            if(rs.next()){
                sos.setIdSo(rs.getInt("idSo"));
                sos.setApaterno(rs.getString("apaterno"));
                sos.setAmaterno(rs.getString("amaterno"));
                sos.setNombres(rs.getString("nombres"));
                sos.setFnac(rs.getString("fnac"));
                sos.setCi(rs.getInt("ci"));
                sos.setCelular(rs.getInt("celular"));
                sos.setCorreo(rs.getString("correo"));
            }
           
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
        return sos;
    }

    @Override
    public List<Socios> getAll() throws Exception {
        List<Socios> lista = null;
        try{
           this.conectar();
            PreparedStatement ps = this.conn.prepareStatement("SELECT * FROM socios");

            ResultSet rs =  ps.executeQuery();
            
            lista = new ArrayList<Socios>();
            
            while(rs.next()){
                Socios sos = new Socios();
                
                sos.setIdSo(rs.getInt("idSo"));
                sos.setApaterno(rs.getString("apaterno"));
                sos.setAmaterno(rs.getString("amaterno"));
                sos.setNombres(rs.getString("nombres"));
                sos.setFnac(rs.getString("fnac"));
                sos.setCi(rs.getInt("ci"));
                sos.setCelular(rs.getInt("celular"));
                sos.setCorreo(rs.getString("correo"));
                
                lista.add(sos);
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
