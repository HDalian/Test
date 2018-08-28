package com.zhinterface.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/student")

public class SetCookie {


    @RequestMapping(value = "/getStu", method = RequestMethod.GET)
    public String getStudent(@RequestParam("stuName") String stuName,
                             @RequestParam("stuClass") String stuClass,
                             ServletResponse res,
                             ServletRequest req){

        HttpServletResponse newResponse = (HttpServletResponse) res;
        newResponse.setHeader("TestHeaderKey", "TestHeaderValue");

        HttpServletRequest newRequest = (HttpServletRequest) req;
        newResponse.addCookie(new Cookie("TestCookie", "CookieText"));

        return "The get student name is " + stuName + " ,class is " + stuClass;


    }
}
