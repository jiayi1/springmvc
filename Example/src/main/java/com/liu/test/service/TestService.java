package com.liu.test.service;

import com.liu.test.dao.generated.dto.LiuDto;
import com.liu.test.dao.generated.entity.LiuEntity;
import com.liu.test.dao.generated.entity.LiuEntityExample;
import com.liu.test.dao.generated.mapper.LiuEntityMapper;
import com.liu.test.util.DozerConvertUtil;
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

    public List<LiuDto> getList() {
        try {
            LiuEntityExample entityExample = new LiuEntityExample();
            List<LiuEntity> list = liuEntityMapper.selectByConcreteExample(entityExample);
            List<LiuDto> listDto = DozerConvertUtil.convertList(list,LiuDto.class);
            return listDto;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * test reset
     * @param name
     * @param age
     * @param addr
     * @param num
     * @return
     */
    public boolean insert(String name, int age, String addr, int num) {
        LiuEntity entity = new LiuEntity();
        entity.setName(name);
        entity.setAge(age);
        entity.setAddr(addr);
        entity.setNum(num);
        int count =  liuEntityMapper.insertSelective(entity);
        return count > 0 ? true :false ;
    }

    public boolean update(int id,String name, int age, String addr, int num) {
        LiuEntity entity = new LiuEntity();
        entity.setName(name);
        entity.setAge(age);
        entity.setAddr(addr);
        entity.setNum(num);
        LiuEntityExample entityExample = new LiuEntityExample();
        entityExample.createCriteria().andIdEqualTo(id);
        int count = liuEntityMapper.updateByConcreteExampleSelective(entity, entityExample);
        return count > 0 ? true :false ;
    }

    public boolean del(int id) {
        LiuEntityExample entityExample = new LiuEntityExample();
        entityExample.createCriteria().andIdEqualTo(id);
        int count =  liuEntityMapper.deleteByConcreteExample(entityExample);
        return count > 0 ? true :false ;
    }

}
