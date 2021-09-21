package com.gabo32.edteam.curso.dao;

import com.gabo32.edteam.curso.models.Role;

import java.util.List;

public interface RoleDao {

    List<Role> getAll();

    Role get(long id);

    Role register(Role user);

    Role update(Role user);

    void delete(long id);
}
