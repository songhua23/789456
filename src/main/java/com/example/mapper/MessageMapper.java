package com.example.mapper;

import com.example.bean.Message;

import java.util.List;

public interface MessageMapper {
    public List<Message> GetAllMessage(Message mes);
    public void InsertMessage(Message mes);
}
