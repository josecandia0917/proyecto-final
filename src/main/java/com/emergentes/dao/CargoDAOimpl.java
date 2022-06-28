
package com.emergentes.dao;

import com.emergentes.modelo.Cargo;
import com.emergentes.utiles.ConexionDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class CargoDAOimpl extends ConexionDB implements CargoDao {

    @Override
    public void insert(Cargo cargo) throws Exception {
        try {
            this.conectar();
            String sql = "INSERT INTO cargos (ncargo) VALUES (?)";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setString(1, cargo.getNcargo());
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }

    @Override
    public void update(Cargo cargo) throws Exception {
        try {
            this.conectar();
            String sql = "UPDATE cargos SET ncargo=? where idCa=?";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setString(1, cargo.getNcargo());
            ps.setInt(2, cargo.getIdCa());
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }

    @Override
    public void delete(int idCa) throws Exception {
        try {
            this.conectar();
            String sql = "DELETE FROM cargos WHERE idCa = ? ";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setInt(1, idCa);
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }

    @Override
    public Cargo getById(int idCa) throws Exception {
        Cargo car = new Cargo();
         try {
            this.conectar();
            String sql = "SELECT * FROM cargos Where idCa = ? ";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setInt(1, idCa);
            
            
            ResultSet rs =  ps.executeQuery();
            if(rs.next()){
                car.setIdCa(rs.getInt("idCa"));
                car.setNcargo(rs.getString("ncargo"));
                
            }
           
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
        return car;
    }

    @Override
    public List<Cargo> getAll() throws Exception {
        List<Cargo> lista = null;
        try{
           this.conectar();
            PreparedStatement ps = this.conn.prepareStatement("SELECT * FROM cargos");

            ResultSet rs =  ps.executeQuery();
            
            lista = new ArrayList<Cargo>();
            
            while(rs.next()){
                Cargo car = new Cargo();
                car.setIdCa(rs.getInt("idCa"));
                car.setNcargo(rs.getString("ncargo"));
                
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
