
package com.emergentes.dao;

import com.emergentes.modelo.Informe;
import java.util.List;


public interface InformeDAO {
    public void insert(Informe informe) throws Exception;
    public void update(Informe informe) throws Exception;
    public void delete(int idIn) throws Exception;
    public Informe getById(int idIn) throws Exception;
    public List<Informe> getAll() throws Exception;
}
