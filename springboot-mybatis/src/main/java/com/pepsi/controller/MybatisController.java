package com.pepsi.controller;


import com.pepsi.service.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MybatisController {

    @Autowired
    private UserinfoService userinfoService;



    @RequestMapping("/getUser")
    public Object getUser(@RequestParam String id){

        return userinfoService.findUserinfoById(Long.parseLong(id));
    }


}
