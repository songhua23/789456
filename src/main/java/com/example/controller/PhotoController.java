package com.example.controller;

import com.example.bean.Photo;
import com.example.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PhotoController {
    @Autowired
    PhotoService photoService;

    @GetMapping("insertphoto")
    @ResponseBody
    public String insertPhoto(Photo photo){
        System.out.println("AAAAA"+photo.toString());
        photoService.insertPhoto(photo);
        return "success";
    }

    @GetMapping("getphoto")
    @ResponseBody
    public List<Photo> getPhoto(Photo photo){
        System.out.println("AAAAA"+photo.toString());
        return photoService.getPhoto(photo);
    }
}
