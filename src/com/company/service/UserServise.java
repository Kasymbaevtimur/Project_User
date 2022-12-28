package com.company.service;

import com.company.model.User;

public interface UserServise {

    void addUser(User uder);

    User findById(int id);

    String deleteById(int id);

    void getAllUsers();
}





