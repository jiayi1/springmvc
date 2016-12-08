package com.liu.test.service;

import com.liu.test.dao.generated.entity.LiuEntity;
import com.liu.test.dao.generated.entity.LiuEntityExample;
import com.liu.test.dao.generated.mapper.LiuEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yulong.liu on 2016/12/1.
 */
@SuppressWarnings("ALL")
@Service
public class TestService {

    @Autowired
    LiuEntityMapper liuEntityMapper;

    public List<LiuEntity> getList() {
        LiuEntityExample entityExample = new LiuEntityExample();
        List<LiuEntity> list = liuEntityMapper.selectByConcreteExample(entityExample);
        for (LiuEntity entity : list) {
            System.out.println(entity.getName());
        }
        return list;
    }

    public void insert(String name, int age, String addr, int num) {
        LiuEntity entity = new LiuEntity();
        entity.setName(name);
        entity.setAge(age);
        entity.setAddr(addr);
        entity.setNum(num);
        liuEntityMapper.insertSelective(entity);
    }

    public void update() {
        LiuEntity entity = new LiuEntity();
        entity.setName("aaaa");
        entity.setAge(10);
        entity.setAddr("nj");
        entity.setNum(12);
        LiuEntityExample entityExample = new LiuEntityExample();
        entityExample.createCriteria().andIdEqualTo(1);
        liuEntityMapper.updateByConcreteExampleSelective(entity, entityExample);
    }

    public void del() {
        LiuEntityExample entityExample = new LiuEntityExample();
        entityExample.createCriteria().andIdEqualTo(1);
        liuEntityMapper.deleteByConcreteExample(entityExample);
    }
}
