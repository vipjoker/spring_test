package com.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {


    @RequestMapping("/hello")
    private Response hello(){
        return new Response("Hello world");
    }

}
