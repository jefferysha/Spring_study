package com.jefferysha.service;

import com.jefferysha.dao.UserDaoImpl;
import com.jefferysha.entity.User;

import java.util.List;

public class UserServiceImpl {

    UserDaoImpl userDao;

    public UserServiceImpl(){

    }
    public List<User> findUserList(){
        return this.userDao.findUserList();
    }

    public void setUserDao(UserDaoImpl userDao) {
        this.userDao = userDao;
    }
}