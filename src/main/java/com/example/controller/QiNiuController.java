package com.example.controller;

import com.example.bean.QiNiu;
import com.qiniu.util.Auth;
import com.qiniu.util.StringMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class QiNiuController {


    @GetMapping("gettoken")
    @ResponseBody
    public QiNiu getToken() {
        QiNiu qiNiu = new QiNiu();
        String accessKey = "wWG_fR6Y4XL7V7aJs8vHU-B87DBqLQmf6UbHIJZd";
        String secretKey = "tVyxZ46OyfhEnA5d75e9IU-SOJRO_tbCkvQstAKJ";
        String bucket = "songhua23"; // 七牛空间名（改为自己的）
        long expireSeconds = 600;   //过期时间
        StringMap putPolicy = new StringMap();
        Auth auth = Auth.create(accessKey, secretKey);
        String upToken = auth.uploadToken(bucket, null, expireSeconds, putPolicy);
        qiNiu.setKey(UUID.randomUUID().toString().replaceAll("\\-", ""));
        qiNiu.setUptoken(upToken);
        System.out.println(qiNiu.getUptoken());
        return qiNiu;
    }
}

