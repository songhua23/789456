package com.example.controller;

import com.example.bean.College;
import com.example.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CollegeController {
        @Autowired
        CollegeService collegeService;

        @GetMapping("getallcollege")
        @ResponseBody
        public List<College> GetAllCollege(College col){
            return collegeService.GetAllCollege(col);
        }
    }

