
package com.emergentes.dao;

import com.emergentes.modelo.Reportecoo;
import java.util.List;


public interface ReportecooDAO {
    public void insert(Reportecoo reportecoo) throws Exception;
    public void update(Reportecoo reportecoo) throws Exception;
    public void delete(int idRe) throws Exception;
    public Reportecoo getById(int idRe) throws Exception;
    public List<Reportecoo> getAll() throws Exception;
}
