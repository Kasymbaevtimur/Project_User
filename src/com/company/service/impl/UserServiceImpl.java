package com.company.service.impl;

import com.company.dao.UserDao;
import com.company.model.MyExseption;
import com.company.model.User;
import com.company.service.UserServise;

public class UserServiceImpl implements UserServise {
    private UserDao userDao = new UserDao();

    @Override
    public void addUser(User user) {
        userDao.getUsers().add(user);

    }

    @Override
    public User findById(int id)throws MyExseption{
     return userDao.getUsers().stream().
             filter(x->x.getId()==id).
             findFirst().
             orElseThrow(()->new MyExseption("Not found"));
    }

    @Override
    public String deleteById(int id) {
        return "Successfully deleted ";
    }

    @Override
    public void getAllUsers() {

    }
}
