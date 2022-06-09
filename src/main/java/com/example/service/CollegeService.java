package com.example.service;

import com.example.bean.College;
import com.example.bean.Message;
import com.example.mapper.CollegeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollegeService {
    @Autowired
    CollegeMapper collegeMapper;

    public List<College> GetAllCollege(College col){return collegeMapper.GetAllCollege(col);}
}
