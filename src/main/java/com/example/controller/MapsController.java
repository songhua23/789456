package com.example.controller;


import com.example.bean.Maps;
import com.example.service.MapsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MapsController {
    @Autowired
    MapsService mapsService;

    @GetMapping("getallmaps")
    @ResponseBody
    public List<Maps> GetAllMaps(){

        return mapsService.GetAllMaps();
    }

    @GetMapping("getallhead")
    @ResponseBody
    public List<Maps> GetAllHead(){
        return mapsService.GetAllHead();
    }

}
