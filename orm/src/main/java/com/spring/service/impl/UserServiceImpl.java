package com.spring.service.impl;

import com.spring.dao.UserDao;
import com.spring.entity.User;
import com.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public int insertUser(User user) {
        return userDao.insert(user);
    }

    @Override
    public List<User> selectUser() {
        return userDao.selectAll();
    }
    @Override
    public int deleteUser(long id) {
        return userDao.deleteByPrimaryKey(id);
    }

    @Override
    public int updateUser(User user) {
        return userDao.updateByPrimaryKey(user);
    }

    @Override
    public List<User> selectUsers() {
        return userDao.selectAll();
    }

    @Override
    public User getUser(long id) {
        return userDao.selectByPrimaryKey(id);
    }



}
