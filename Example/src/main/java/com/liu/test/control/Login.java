package com.liu.test.control;

import com.liu.test.common.Response;
import com.liu.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

/**
 * Created by yulong.liu on 2016/12/1.
 */
@Controller
@RequestMapping (value = "/login")
public class Login  extends BaseController{

    @Autowired
    TestService service;

//    @RequestMapping (value = "/login" )
//    public String login(@RequestParam("name") String name, @RequestParam("age") int age, @RequestParam("addr") String addr,
//                        @RequestParam("num") int num){
//        System.out.print("你访问了login:"+name +","+age);
//        return "success";
//    }

    @RequestMapping(value = "")
    public String login(){
        System.out.print("你访问了login");
        return "success";
    }


    @RequestMapping(value = "/getTestData",method = RequestMethod.GET)
    @ResponseBody
    public String getTestData(){
     //   return this.success("name");
        return "name";
    }

}
