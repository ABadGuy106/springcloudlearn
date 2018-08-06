package net.abadguy.asimpleprovideruser.dao;

import net.abadguy.asimpleprovideruser.entity.User;

import java.util.List;

public interface UserDao {

    public List<User> queryUser();

    public User queryUserById(int id);
}
