package com.example.service;

import com.example.bean.Message;
import com.example.mapper.MessageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {
    @Autowired
    MessageMapper messageMapper;

    public List<Message> GetAllMessage(Message mes){
        return messageMapper.GetAllMessage(mes);
    }

    public void InsertMessage(Message mes){
         messageMapper.InsertMessage(mes);
    }
}
