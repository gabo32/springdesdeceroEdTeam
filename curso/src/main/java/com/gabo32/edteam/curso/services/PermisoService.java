package com.gabo32.edteam.curso.services;

import com.gabo32.edteam.curso.dao.PermisoDao;
import com.gabo32.edteam.curso.dao.RoleDao;
import com.gabo32.edteam.curso.models.Permiso;
import com.gabo32.edteam.curso.models.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class PermisoService {

    @Autowired
    PermisoDao permisoDao;

    public List<Permiso> getAll() {
        return permisoDao.getAll();
    }


    public Permiso get(@PathVariable long id) {
        return permisoDao.get(id);
    }


    public Permiso register(@RequestBody Permiso permiso) {
        return permisoDao.register(permiso);
    }


    public Permiso update(@RequestBody Permiso permiso) {
        return permisoDao.update(permiso);
    }


    public void delete(@PathVariable long id) {
        permisoDao.delete(id);
    }
}
