package com.example.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Collegedetail {
    private int collegeID;
    private String collegename;
    private String imageurla;
    private String imageurlb;
    private String imageurlc;
    private String detail;
    private String details;
}
