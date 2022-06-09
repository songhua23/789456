package com.example.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Message {
    private int messageid;
    private  int createid;
    private  int takeid;
    private  String text;
    private  String messagetime;
    private  String userName;
    private  String head;
    private  String takename;
}
