
package com.emergentes.dao;

import com.emergentes.modelo.Socios;
import java.util.List;


public interface SociosDAO {
    public void insert(Socios socios) throws Exception;
    public void update(Socios socios) throws Exception;
    public void delete(int idSo) throws Exception;
    public Socios getById(int idSo) throws Exception;
    public List<Socios> getAll() throws Exception;
}
