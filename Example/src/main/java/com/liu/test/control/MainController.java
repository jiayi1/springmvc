package com.liu.test.control;

import com.liu.test.common.Response;
import com.liu.test.dao.generated.entity.LiuEntity;
import com.liu.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by yulong.liu on 2016/11/30.
 */
@Controller
@RequestMapping(value = "/app")
public class MainController extends BaseController{

    @Autowired
    TestService service;

    @RequestMapping (value = "/list",method = RequestMethod.GET)
    public String index(ModelMap model, HttpServletRequest request){
        System.out.print("你访问了,index");
        return "index";
    }

    @RequestMapping(value = "update",method = RequestMethod.POST)
    public Response update(@RequestParam("name") String name, @RequestParam("age") int age,
                           @RequestParam("addr") String addr, @RequestParam("num") int num ){
        boolean isSuccess  = service.update(name,age,addr,num);
        return this.success(isSuccess);
    }


}
