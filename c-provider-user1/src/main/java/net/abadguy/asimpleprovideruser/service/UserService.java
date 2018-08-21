package net.abadguy.asimpleprovideruser.service;

import net.abadguy.asimpleprovideruser.entity.User;

import java.util.List;

public interface UserService {

    public List<User> queryUser();

    public User queryUserById(int id);
}
