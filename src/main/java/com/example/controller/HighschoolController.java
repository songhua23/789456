package com.example.controller;

import com.example.bean.College;
import com.example.bean.Highschool;
import com.example.service.HighschoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HighschoolController {
    @Autowired
    HighschoolService highschoolService;

    @GetMapping("getallhighschool")
    @ResponseBody
    public List<Highschool> GetAllHighschool(Highschool high) {
        return highschoolService.GetAllHighschool(high);
    }
}