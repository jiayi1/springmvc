package com.liu.test.control;

import com.liu.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by yulong.liu on 2016/11/30.
 */
@Controller
public class MainController {

    @Autowired
    TestService service;
    @RequestMapping (value = "/",method = RequestMethod.GET)
    public String index(){
        System.out.print("你访问了,index");
        service.getList();
        return "index";
    }
}
