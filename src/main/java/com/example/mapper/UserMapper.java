package com.example.mapper;

import com.example.bean.User;

import java.util.List;

public interface UserMapper {
    public List<User> getUser(User user);

    public void Login(User user);

    public User getUserDetail(User user);

    public User getUserDetailByname(User user);

    public void updataUser(User user);

    public void newUser(User user);

    public void deleteUser(User user);

    public User getUserDetailByid(User user);

    public void delUserDetailByid(User user);
}