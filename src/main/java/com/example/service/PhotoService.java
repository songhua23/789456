package com.example.service;

import com.example.bean.Photo;
import com.example.mapper.PhotoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhotoService {

    @Autowired
    PhotoMapper photoMapper;

    public void insertPhoto(Photo photo){
        photoMapper.insertPhoto(photo);

    }

    public List<Photo> getPhoto(Photo photo){
        return photoMapper.getPhoto(photo);
    }

}
