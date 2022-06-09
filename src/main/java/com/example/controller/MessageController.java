package com.example.controller;

import com.example.bean.Message;
import com.example.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MessageController {
    @Autowired
    MessageService messageService;

    @GetMapping("getallmessage")
    @ResponseBody
    public List<Message> GetAllMessage(Message mes){
        return  messageService.GetAllMessage(mes);

    }

    @GetMapping("insertmessage")
    @ResponseBody
    public void InsertMessage(Message mes){
        System.out.println("aa"+mes.toString());
        messageService.InsertMessage(mes);

    }

}
