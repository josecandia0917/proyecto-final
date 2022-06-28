
package com.emergentes.dao;

import com.emergentes.modelo.Informe;
import com.emergentes.utiles.ConexionDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class InformeDAOimpl extends ConexionDB implements InformeDAO {

    @Override
    public void insert(Informe informe) throws Exception {
        try {
            this.conectar();
            String sql = "INSERT INTO informe (socioid, cargoid,repoid, finf)values (?,?,?,?)";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setInt(1, informe.getSocioid());
            ps.setInt(2, informe.getCargoid());
            ps.setInt(3, informe.getRepoid());
            ps.setString(4, informe.getFinf());
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }

    @Override
    public void update(Informe informe) throws Exception {
        try {
            this.conectar();
            String sql = "UPDATE informe SET socioid=?, cargoid=?,repoid=?, finf=? where idIn = ? ";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setInt(1, informe.getSocioid());
            ps.setInt(2, informe.getCargoid());
            ps.setInt(3, informe.getRepoid());
            ps.setString(4, informe.getFinf());
            ps.setInt(5, informe.getIdIn());
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }

    @Override
    public void delete(int idIn) throws Exception {
        try {
            this.conectar();
            String sql = "DELETE FROM informe WHERE idIn = ? ";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setInt(1, idIn);
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }

    @Override
    public Informe getById(int idIn) throws Exception {
        Informe inf = new Informe();
        try {
            this.conectar();
            String sql = "SELECT * FROM informe Where idIn = ? ";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setInt(1, idIn);
            
            
            ResultSet rs =  ps.executeQuery();
            if(rs.next()){
                inf.setIdIn(rs.getInt("idIn"));
                inf.setSocioid(rs.getInt("socioid"));
                inf.setCargoid(rs.getInt("cargoid"));
                inf.setRepoid(rs.getInt("repoid"));
                inf.setFinf(rs.getString("finf"));
                
            }
           
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
        return inf; 
    }

    @Override
    public List<Informe> getAll() throws Exception {
        List<Informe> lista = null;
        try{
           this.conectar();
           String sql = "SELECT f.*,s.apaterno ,s.amaterno,s.nombres,c.ncargo,r.gsemana,r.fecha,r.hora,r.lugar ";
           sql += " FROM informe f LEFT JOIN socios s ON f.socioid = s.idSo ";
           sql += "LEFT JOIN cargos c ON f.socioid = c.idCa ";
           sql += "LEFT JOIN reportecoo r ON f.repoid = r.idRe ";
           
           PreparedStatement ps = this.conn.prepareStatement(sql);

            ResultSet rs =  ps.executeQuery();
            
            lista = new ArrayList<Informe>();
            
            while(rs.next()){
                Informe inf = new Informe();
                inf.setIdIn(rs.getInt("idIn"));
                inf.setSocioid(rs.getInt("socioid"));
                inf.setCargoid(rs.getInt("cargoid"));
                inf.setRepoid(rs.getInt("repoid"));
                inf.setFinf(rs.getString("finf"));
                inf.setApaterno(rs.getString("apaterno"));
                inf.setAmaterno(rs.getString("amaterno"));
                inf.setNombres(rs.getString("nombres"));
                inf.setNcargo(rs.getString("ncargo"));
                inf.setGsemana(rs.getString("gsemana"));
                inf.setFecha(rs.getString("fecha"));
                inf.setHora(rs.getString("hora"));
                inf.setLugar(rs.getString("lugar"));
                
                lista.add(inf);
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
