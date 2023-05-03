package com.schen.demo_java17.controller;

import com.schen.demo_java17.entity.Demo;
import com.schen.demo_java17.service.DemoService;
import com.schen.demo_java17.service.serviceImpl.DemoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/demotest")
public class DemoController {

    @Autowired
    DemoService demoService;

    @GetMapping("/getdemolist")
    public List getDemoList(){
        List<Demo> list = demoService.list();
        return list;
    }


}
