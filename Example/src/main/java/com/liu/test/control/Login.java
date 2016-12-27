package com.liu.test.control;

import com.liu.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by yulong.liu on 2016/12/1.
 */
@Controller
public class Login {

    @Autowired
    TestService service;

    @RequestMapping (value = "/" , method = RequestMethod.POST)
    public String login(@RequestParam("name") String name, @RequestParam("age") int age, @RequestParam("addr") String addr,
                        @RequestParam("num") int num){
        System.out.print("你访问了login:"+name +","+age);
        return "success";
    }

}
