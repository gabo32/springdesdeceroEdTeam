package com.gabo32.edteam.curso.services;

import com.gabo32.edteam.curso.dao.UserDao;
import com.gabo32.edteam.curso.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public List<User> getAll() {
        return userDao.getAll();
    }


    public User get(@PathVariable long id) {
        return userDao.get(id);
    }


    public User register(@RequestBody User user) {
        return userDao.register(user);
    }


    public User update(@RequestBody User user) {
        return userDao.update(user);
    }


    public void delete(@PathVariable long id) {
        userDao.delete(id);
    }
}
