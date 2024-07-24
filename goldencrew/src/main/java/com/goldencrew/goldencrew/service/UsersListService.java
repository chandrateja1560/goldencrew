package com.goldencrew.goldencrew.service;

import com.goldencrew.goldencrew.dao.UsersDao;
import com.goldencrew.goldencrew.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersListService {
    @Autowired
    UsersDao usersDao;


    public List<Users> getAllUsers(){
        return usersDao.findAll();
    }

    public Users getUserByUsername(String username) {
        return usersDao.findByUsername(username);
    }
}

