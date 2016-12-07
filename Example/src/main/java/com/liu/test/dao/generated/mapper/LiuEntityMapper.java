package com.liu.test.dao.generated.mapper;

import com.liu.test.dao.MarkerInterface;
import com.liu.test.dao.generated.entity.LiuEntity;
import com.liu.test.dao.generated.entity.LiuEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.BaseMapper;
import tk.mybatis.mapper.common.ExampleMapper;
import tk.mybatis.mapper.common.RowBoundsMapper;

public interface LiuEntityMapper extends MarkerInterface, RowBoundsMapper<LiuEntity>, BaseMapper<LiuEntity>, ExampleMapper<LiuEntity> {
    int countByConcreteExample(LiuEntityExample example);

    int deleteByConcreteExample(LiuEntityExample example);

    List<LiuEntity> selectByConcreteExample(LiuEntityExample example);

    int updateByConcreteExampleSelective(@Param("record") LiuEntity record, @Param("example") LiuEntityExample example);

    int updateByConcreteExample(@Param("record") LiuEntity record, @Param("example") LiuEntityExample example);
}