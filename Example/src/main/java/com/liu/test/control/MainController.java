package com.liu.test.control;

import com.liu.test.common.Response;
import com.liu.test.dao.generated.dto.LiuDto;
import com.liu.test.dao.generated.entity.LiuEntity;
import com.liu.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yulong.liu on 2016/11/30.
 */
@Controller
//@RequestMapping(value = "/app")
public class MainController extends BaseController{

    @Autowired
    TestService service;

    @RequestMapping (value = "/")
    public String index(ModelMap model, HttpServletRequest request){
        System.out.print("你访问了,index");
        return "index";
    }

    @RequestMapping(value = "/getList")
    @ResponseBody
    public List<LiuDto> getList(){
        try {
            List<LiuDto> liuDtos = service.getList();
            return liuDtos;
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> insert(@RequestBody LiuEntity body){
        boolean isSuccess  = service.insert(body.getName(),body.getAge(),body.getAddr(),body.getNum());
        Map<String,Object> map = new HashMap<>();
        map.put("data",isSuccess);
        return map;
    }

    @RequestMapping(value = "/del")
    @ResponseBody
    public Map<String,Object> del(@RequestParam("id") int id){
        Map<String,Object> map = new HashMap<>();
        boolean isDelSuccess = service.del(id);
        map.put("data",isDelSuccess);
        return  map;
    }


    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> update(@RequestBody LiuEntity body){
        boolean isSuccess  = service.update(body.getId(),body.getName(),body.getAge(),body.getAddr(),body.getNum());
        Map<String,Object> map = new HashMap<>();
        map.put("data",isSuccess);
        return map;
    }


}
