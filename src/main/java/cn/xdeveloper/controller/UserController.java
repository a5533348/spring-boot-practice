package cn.xdeveloper.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/3/30.
 */
@RestController
public class UserController {

    @RequestMapping("/test")
    public String test(){
        return "hello test!";
    }

    @RequestMapping("/")
    public String index(){
        return "hello spring boot!";
    }


}
