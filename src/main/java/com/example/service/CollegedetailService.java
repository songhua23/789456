package com.example.service;

import com.example.bean.Collegedetail;
import com.example.mapper.CollegedetailMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollegedetailService {
    @Autowired
    CollegedetailMapper collegedetailMapper;

    public List<Collegedetail> getColdetail(Collegedetail collegedetail){
        return collegedetailMapper.getColdetail(collegedetail);
    }
    public List<Collegedetail> getColdetailbyid(Collegedetail collegedetail){
        return collegedetailMapper.getColdetailbyid(collegedetail);
    }
}
