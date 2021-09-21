package com.gabo32.edteam.curso.controllers;

import com.gabo32.edteam.curso.models.Permiso;
import com.gabo32.edteam.curso.models.User;
import com.gabo32.edteam.curso.services.PermisoService;
import com.gabo32.edteam.curso.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("permiso")
public class PermisoController {

    @Autowired
    PermisoService permisoService;

    //Trae todos los permisos
    @RequestMapping(value = "/", method = RequestMethod.GET)
    List<Permiso> getAll() {
        return permisoService.getAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    Permiso get(@PathVariable long id) {
        return permisoService.get(id);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    Permiso register(@RequestBody Permiso permiso) {
        return permisoService.register(permiso);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    Permiso update(@RequestBody Permiso permiso) {
        return permisoService.update(permiso);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    void delete(@PathVariable long id) {
        permisoService.delete(id);
    }
}
