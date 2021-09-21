package com.gabo32.edteam.curso.dao;

import com.gabo32.edteam.curso.models.Permiso;

import java.util.List;

public interface PermisoDao {

    List<Permiso> getAll();

    Permiso get(long id);

    Permiso register(Permiso user);

    Permiso update(Permiso user);

    void delete(long id);
}
