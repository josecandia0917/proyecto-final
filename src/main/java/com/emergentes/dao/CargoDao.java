
package com.emergentes.dao;

import com.emergentes.modelo.Cargo;
import java.util.List;


public interface CargoDao {
    public void insert(Cargo cargo) throws Exception;
    public void update(Cargo cargo) throws Exception;
    public void delete(int idCa) throws Exception;
    public Cargo getById(int idCa) throws Exception;
    public List<Cargo> getAll() throws Exception;
}
