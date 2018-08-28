package com.zhinterface.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/user")
public class FirstRequests {

    //get写法一,url-->http://localhost:8081/user/getUser/userName
    /**
    @RequestMapping(value = "/getUser/{userName}", method = RequestMethod.GET)
    public String getUser(@PathVariable String userName){
        return "The get userName is: " + userName;
    }
    **/


    //get写法二,url-->http://localhost:8081/user/getUser?userName=**&phone=**
    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public String getUser(@RequestParam("userName") String userName,
                          @RequestParam("phone") String Phone){
        return "The get userName is: " + userName + "--- phone is: " + Phone;
    }


    @RequestMapping(value = "/postUser", method = RequestMethod.POST)
    public String postUser(@RequestParam String userName,
                           @RequestParam String phone){
        return "The post userName is: " + userName + "--- phone is: " + phone;
    }



}

