package com.liu.test.control;

import com.liu.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 * Created by yulong.liu on 2016/12/1.
 */
@Controller
public class Login {

    @Autowired
    TestService service;

    @RequestMapping (value = "login" , method = RequestMethod.GET)
    public String login(){
        System.out.print("你访问了login");
        service.insert();
        return "success";
    }

}