package com.eric.service;

import com.eric.dao.UserDao;
import com.eric.dao.UserDaoImpl;

public class UserServiceImpl implements UserService {
    @Override
    public void getService() {
        UserDao dao = new UserDaoImpl();
        System.out.println("实现了UserService！");

        dao.getUser();
    }
}
