package com.example.service;

import com.example.bean.User;
import com.example.bean.User;
import com.example.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public List<User> getUser(User user) {
        return userMapper.getUser(user);
    }

    public void Login(User user){ userMapper.Login(user);}

    public User getUserDetail(User user) {
        return userMapper.getUserDetail(user);
    }

    public User getUserDetailByname(User user) {
        return userMapper.getUserDetailByname(user);
    }

    public void updataUser(User user){
        userMapper.updataUser(user);
    }

    public void newUser(User user){userMapper.newUser(user);}

    public void deleteUser(User user) {userMapper.deleteUser(user); }

    public User getUserDetailByid(User user) {return userMapper.getUserDetailByid(user); }

    public void delUserDetailByid(User user) { userMapper.delUserDetailByid(user); }


//    public User GetAllDetail(User user){return userMapper.GetAllDetail(user);}
}