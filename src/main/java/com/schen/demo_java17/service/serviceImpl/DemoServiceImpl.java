package com.schen.demo_java17.service.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.schen.demo_java17.entity.Demo;
import com.schen.demo_java17.service.DemoService;
import com.schen.demo_java17.mapper.DemoMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【demo】的数据库操作Service实现
* @createDate 2023-05-02 16:44:56
*/
@Service
public class DemoServiceImpl extends ServiceImpl<DemoMapper, Demo>
    implements DemoService{

}




