package com.example.controller;

import com.example.bean.Result;
import com.example.bean.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class
UserController {

    @Autowired
    UserService userService;

    @GetMapping("getuserdetail")
    @ResponseBody
    public User getUserDetail(User user){
        System.out.println(user.getHead());
        return userService.getUserDetail(user);

    }

    @GetMapping("getuserdetailbyname")
    @ResponseBody
    public User getUserDetailByname(User user){
        System.out.println("AAA"+user.toString());
        return userService.getUserDetailByname(user);

    }

    @GetMapping("getuserdetailbyid")
    @ResponseBody
    public User getUserDetailByid(User user){
        return userService.getUserDetailByid(user);

    }

    @GetMapping("deluserdetailbyid")
    @ResponseBody
    public void delUserDetailByid(User user){
        System.out.println("AAA"+user.toString());
         userService.delUserDetailByid(user);

    }

    @GetMapping("updatauser")
    @ResponseBody
    public Result updataUser(User user){
        userService.updataUser(user);
        System.out.println("userdetail"+user.toString());
        Result result = new Result();
        result.setSuccess(true);
        return result;
    }


    @GetMapping("getuser")
    @ResponseBody
    public List<User> getUser(User user){
        List<User> us = new ArrayList<>();
        us = userService.getUser(user);
//        for (int i=0;i<us.size();i++){
//            System.out.println("AAA"+us.get(i).toString());
//        }
        return us;
    }

    @GetMapping("newuser")
    @ResponseBody
    public Result newUser(User user){
        System.out.println("aa"+user.toString());
        userService.newUser(user);
        Result result = new Result();
        result.setSuccess(true);
        return result;
    }

    @GetMapping("deleteuser")
    @ResponseBody
    public void deleteUser(User user){
        userService.deleteUser(user);
    }

    @GetMapping("login")
    @ResponseBody
    public Result Login(User user){
        String WX_URL = "https://api.weixin.qq.com/sns/jscode2session?appid=APPID&secret=SECRET&js_code=JSCODE&grant_type=authorization_code";
        String requestUrl = WX_URL.replace("APPID", "wxae599b88bbda8198").//填写自己的appid
                replace("SECRET", "81819488c1070508a63a0a86b991dee2").replace("JSCODE", user.getCode()).//填写自己的appsecret，
                replace("authorization_code", "authorization_code");
        //定义json对象
        JSONObject convertvalue=new JSONObject();
        //调用get方法
        String  returnvalue=GET(requestUrl);
        convertvalue= (JSONObject) JSON.parse(returnvalue);
        String openid= (String) convertvalue.get("openid");
        System.out.println(returnvalue);
        user.setOpenID(openid);
        System.out.println(user.toString());
        String token="token_"+new Date().getTime();
        System.out.println(token);
        Result result = new Result();
        result.setSuccess(true);
        result.setData(token);
        userService.Login(user);
        return result;
    }
    //发起ge请求---生成openid和session_key
    public  String GET(String url) {
        String result="";
        BufferedReader in = null;
        InputStream is = null;
        InputStreamReader isr = null;
        try{
            //构造url对象
            URL realUrl = new URL(url);
            //获取一个对应该URL的URLConnection对象
            URLConnection conn = realUrl.openConnection();
            conn.connect();
            is = conn.getInputStream();
            isr = new InputStreamReader(is);
            in = new BufferedReader(isr);
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("异常出现");
        }
        //关闭资源
        finally {
            try {
                if (in != null) {
                    in.close();
                }
                if (is != null) {
                    is.close();
                }
                if (isr != null) {
                    isr.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("出现异常");
            }
        }
        return result;
    }

}