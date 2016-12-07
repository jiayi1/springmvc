package com.liu.test.dao.generated.mapper;

import com.liu.test.dao.MarkerInterface;
import com.liu.test.dao.generated.entity.YuEntity;
import com.liu.test.dao.generated.entity.YuEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.BaseMapper;
import tk.mybatis.mapper.common.ExampleMapper;
import tk.mybatis.mapper.common.RowBoundsMapper;

public interface YuEntityMapper extends MarkerInterface, RowBoundsMapper<YuEntity>, BaseMapper<YuEntity>, ExampleMapper<YuEntity> {
    int countByConcreteExample(YuEntityExample example);

    int deleteByConcreteExample(YuEntityExample example);

    List<YuEntity> selectByConcreteExample(YuEntityExample example);

    int updateByConcreteExampleSelective(@Param("record") YuEntity record, @Param("example") YuEntityExample example);

    int updateByConcreteExample(@Param("record") YuEntity record, @Param("example") YuEntityExample example);
}