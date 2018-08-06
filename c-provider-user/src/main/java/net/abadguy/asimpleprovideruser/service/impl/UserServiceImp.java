package net.abadguy.asimpleprovideruser.service.impl;

import net.abadguy.asimpleprovideruser.dao.UserDao;
import net.abadguy.asimpleprovideruser.entity.User;
import net.abadguy.asimpleprovideruser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> queryUser() {
        return userDao.queryUser();
    }

    @Override
    public User queryUserById(int id) {
        return userDao.queryUserById(id);
    }
}
