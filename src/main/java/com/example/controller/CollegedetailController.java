package com.example.controller;

import com.example.bean.Collegedetail;
import com.example.bean.Collegedetail;
import com.example.service.CollegedetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CollegedetailController {
    @Autowired
    CollegedetailService collegedetailService;

    @GetMapping("getcoldetail")
    @ResponseBody
    public List<Collegedetail> getColdetail(Collegedetail collegedetail){
        //System.out.println("AAAAA");
        return collegedetailService.getColdetail(collegedetail);
    }
    @GetMapping("getcoldetailbyid")
    @ResponseBody
    public List<Collegedetail> getColdetailbyid(Collegedetail collegedetail){
        //System.out.println("AAAAA");
        return collegedetailService.getColdetailbyid(collegedetail);
    }
}
