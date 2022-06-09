package com.example.service;

import com.example.bean.Highschool;
import com.example.mapper.HighschoolMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HighschoolService {
    @Autowired
    HighschoolMapper highschoolMapper;

    public List<Highschool> GetAllHighschool(Highschool high){return highschoolMapper.GetAllHighschool(high);}
}
