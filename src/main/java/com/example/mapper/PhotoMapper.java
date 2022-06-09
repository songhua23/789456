package com.example.mapper;

import com.example.bean.Photo;

import java.util.List;

public interface PhotoMapper {
    public void insertPhoto(Photo photo);

    public List<Photo> getPhoto(Photo photo);
}
