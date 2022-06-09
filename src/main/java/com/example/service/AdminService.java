package com.example.service;

import com.example.bean.Admin;
import com.example.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    AdminMapper adminMapper;

    public void GetAllAdmin(Admin admin){adminMapper.GetAllAdmin(admin);}

    public Admin loginAdmin(Admin admin){
        return adminMapper.loginAdmin(admin);

    }
}
