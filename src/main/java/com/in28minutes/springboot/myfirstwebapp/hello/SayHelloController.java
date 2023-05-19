package com.in28minutes.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

    @ResponseBody
    @RequestMapping("/say-hello")
    public String sayHello() {
        return "Hello World!";

    }


    @RequestMapping("/say-hello-jsp")
    public String sayHelloJsp() {
        return "sayHello";

    }
}
