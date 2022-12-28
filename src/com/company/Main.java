package com.company;

import com.company.model.MyExseption;
import com.company.model.User;
import com.company.model.gender.Gender;
import com.company.service.impl.UserServiceImpl;

public class Main {

    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        User user1 = new User(1, "Timurlan", 25, Gender.MALE);
        User user2 = new User(2, "Baiaman", 23, Gender.MALE);
        User user3 = new User(3, "Berdibek", 30, Gender.MALE);

        userService.addUser(user1);
        userService.addUser(user2);
        userService.addUser(user3);
        try {
            System.out.println(userService.findById(1));
        }catch (MyExseption e){
            System.out.println(e.getMessage());
        }




    }
}

