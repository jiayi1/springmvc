package com.liu.test.dao.generated.dto;

import com.liu.test.dao.generated.entity.LiuEntity;

/**
 * Created by yulong.liu on 2016/12/27.
 */
public class LiuDto extends LiuEntity {

    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
