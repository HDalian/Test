package com.zhinterface.demo;

import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.HashMap;

@RestController
@RequestMapping("/student")

public class PostJson1 {

    @RequestMapping(value = "/postStu", method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> postStudent(@RequestBody Student s){

        Map<String,Object> result = new HashMap<String, Object>();
        result.put("code",0);
        result.put("msg","post success");
        result.put("data",s);

        return result;

    }
}
