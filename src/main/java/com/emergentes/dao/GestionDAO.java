
package com.emergentes.dao;


import com.emergentes.modelo.Gestion;
import java.util.List;


public interface GestionDAO {
    public void insert(Gestion gestion) throws Exception;
    public void update(Gestion gestion) throws Exception;
    public void delete(int idGe) throws Exception;
    public Gestion getById(int idGe) throws Exception;
    public List<Gestion> getAll() throws Exception;
}
