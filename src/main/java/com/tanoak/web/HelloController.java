package com.tanoak.web;

import com.tanoak.entity.Hello;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by IntelliJ IDEA
 *
 * @author tanoak
 * @date 2018/3/23
 * @desc
 */
@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/test")
    public Hello toHello(){
        Hello hello = new Hello() ;
        hello.setId(1);
        hello.setName("tom");
        return hello  ;
    }
}
