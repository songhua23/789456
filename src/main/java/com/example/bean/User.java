package com.example.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private int userID;
    private String openID;
    private String head;
    private String userName;
    private String sex;
    private String birthYear;
    private String collegeName;
    private String highschoolName;
    private String address;
    private String tele;
    private String code;
}