package com.gabo32.edteam.curso.controllers;

import com.gabo32.edteam.curso.models.Permiso;
import com.gabo32.edteam.curso.models.Role;
import com.gabo32.edteam.curso.services.PermisoService;
import com.gabo32.edteam.curso.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("role")
public class RoleController {

    @Autowired
    RoleService rolService;

    //Trae todos los roles
    @RequestMapping(value = "/", method = RequestMethod.GET)
    List<Role> getAll() {
        return rolService.getAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    Role get(@PathVariable long id) {
        return rolService.get(id);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    Role register(@RequestBody Role role) {
        return rolService.register(role);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    Role update(@RequestBody Role role) {
        return rolService.update(role);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    void delete(@PathVariable long id) {
        rolService.delete(id);
    }
}
