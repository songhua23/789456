package com.example.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Maps {
    private int userID;
    private int twoid;
    private  String userName;
    private String longitude;
    private String latitude;
    private String head;
    private int oneid;

}
