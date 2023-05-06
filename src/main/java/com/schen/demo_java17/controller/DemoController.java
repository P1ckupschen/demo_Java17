package com.schen.demo_java17.controller;

import com.schen.demo_java17.Result.R;
import com.schen.demo_java17.entity.Demo;
import com.schen.demo_java17.service.DemoService;
import com.schen.demo_java17.service.serviceImpl.DemoServiceImpl;
import com.schen.demo_java17.threadlocal.localholder;
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
    public R getDemoList(){
        List<Demo> list = demoService.list();

        return R.ok(list);
    }
    @GetMapping("/getlocalstring")
    public String getLocalString(){
        String s = localholder.get();
        return s;
    }


}
