package com.boot.main.controller;


import org.apache.commons.beanutils.BeanUtils;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.util.Base64;

@RestController
public class HelloController {

    private final Logger logger =Logger.getLogger(getClass());


    @RequestMapping(value = "/eat", method = RequestMethod.GET)
    public String eat(HttpServletRequest request,HttpServletResponse response)
    {
        String sessionId =request.getSession().getId();
        return "吃翔翔的sessionId:"+sessionId;
    }

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, UnsupportedEncodingException {

        System.out.println(-5855&Integer.MAX_VALUE);


        String str = Base64.getEncoder().encodeToString("jazz好".getBytes("utf-8"));
        System.out.println(str);

        byte[] bytes=Base64.getDecoder().decode(str);
        System.out.println(new String(bytes,"utf-8"));
    }


}
