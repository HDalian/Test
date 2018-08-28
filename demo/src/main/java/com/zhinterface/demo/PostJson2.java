package com.zhinterface.demo;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/student")

public class PostJson2 {

    List<Student> sList = new ArrayList<Student>();

    @RequestMapping(value = "/addStu",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> postStudent(@RequestBody Student s){

        sList.add(s);

        Map<String, Object> result = new HashMap<String, Object>();
        result.put("code",0);
        result.put("msg","add success");
        result.put("data",sList);
        return result;

    }

}
