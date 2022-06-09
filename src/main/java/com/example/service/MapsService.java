package com.example.service;

import com.example.bean.Maps;
import com.example.mapper.MapsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MapsService {
    @Autowired
    MapsMapper mapsMapper;

    public List<Maps> GetAllMaps(){return mapsMapper.GetAllMaps();}
    public List<Maps> GetAllHead(){return mapsMapper.GetAllHead();}
}
