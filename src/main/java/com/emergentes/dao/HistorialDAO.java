
package com.emergentes.dao;

import com.emergentes.modelo.Historial;
import java.util.List;


public interface HistorialDAO {
    public void insert(Historial historial) throws Exception;
    public void update(Historial historial) throws Exception;
    public void delete(int idHi) throws Exception;
    public Historial getById(int idHi) throws Exception;
    public List<Historial> getAll() throws Exception;
}
