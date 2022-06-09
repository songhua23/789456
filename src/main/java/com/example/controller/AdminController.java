package com.example.controller;

import com.example.bean.Admin;
import com.example.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AdminController {
    @Autowired
    AdminService adminService;

    @GetMapping("getalladmin")
    @ResponseBody
    public String GetAllAdmin(Admin admin){
          adminService.GetAllAdmin(admin);
          return "success";
    }

    @GetMapping("loginadmin")
    @ResponseBody
    public Admin loginAdmin(Admin admin){
        return adminService.loginAdmin(admin);
    }

}
