package com.schen.demo_java17.mapper;

import com.schen.demo_java17.entity.Demo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author Administrator
* @description 针对表【demo】的数据库操作Mapper
* @createDate 2023-05-02 16:44:56
* @Entity com.schen.demo_java17.entity.Demo
*/
@Mapper
public interface DemoMapper extends BaseMapper<Demo> {

}




