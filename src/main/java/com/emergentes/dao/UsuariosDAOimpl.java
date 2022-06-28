
package com.emergentes.dao;

import com.emergentes.modelo.Usuarios;
import com.emergentes.utiles.ConexionDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UsuariosDAOimpl extends ConexionDB implements UsuariosDAO{

    @Override
    public void insert(Usuarios usuarios) throws Exception {
        try{
            this.conectar();
            String sql = "INSERT INTO usuarios (email, password ) VALUES (?, SHA1(?))";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setString(1, usuarios.getEmail());
            ps.setString(2, usuarios.getPassword());
 
            // Ejecutar Consulta
            ps.executeUpdate();
        }catch(Exception e){
            throw e;
        } finally{
            this.desconectar();
        }
    }

    @Override
    public void update(Usuarios usuarios) throws Exception {
        try{
            this.conectar();
            String sql = "UPDATE usuarios SET email=?,password=SHA1(?) WHERE id = ?";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setString(1, usuarios.getEmail());
            ps.setString(2, usuarios.getPassword());     
            ps.setInt(3, usuarios.getId());
            // Ejecutar Consulta
            ps.executeUpdate();
        }catch(Exception e){
            throw e;
        } finally{
            this.desconectar();
        }
    }

    @Override
    public void delete(int id) throws Exception {
        try{
            this.conectar();
            String sql = "DELETE FROM usuarios WHERE id = ?";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setInt(1, id);
            // Ejecutar Consulta
            ps.executeUpdate();
        }catch(Exception e){
            throw e;
        } finally{
            this.desconectar();
        }
    }

    @Override
    public Usuarios getById(int id) throws Exception {
        Usuarios usu = new Usuarios();
        try{
            this.conectar();
            
            String sql = "SELECT * FROM usuarios WHERE id = ?";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                usu.setId(rs.getInt("id"));
                usu.setEmail(rs.getString("email")); 
                usu.setPassword(rs.getString("password")); 
             
            }
        }catch(Exception e){
            throw e;
        } finally{
            this.desconectar();
        }
        return usu;
    }

    @Override
    public List<Usuarios> getAll() throws Exception {
        List<Usuarios> lista = null;
        try{
            this.conectar();
            
            String sql = "SELECT * FROM usuarios ";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<Usuarios>();
            while (rs.next()) {
                Usuarios usu = new Usuarios();
                
                usu.setId(rs.getInt("id"));
                usu.setEmail(rs.getString("email")); 
                usu.setPassword(rs.getString("password")); 
                
                lista.add(usu);
            }
        }catch(Exception e){
            throw e;
        } finally{
            this.desconectar();
        }
        return lista;
    }
    
}
