package cn.xdeveloper.controller;

import cn.xdeveloper.entity.User;
import cn.xdeveloper.http.HttpResult;
import cn.xdeveloper.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by Administrator on 2017/3/30.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping(value = "/login")
    public HttpResult login(String account, String password) {
        User user = userService.login(account, password);

        return new HttpResult(HttpResult.STATUS_SUCCESS, user);
    }


    @PostMapping("/register")
    public HttpResult register(String account, String password) {

        User user = new User();
        user.setAccount(account);
        user.setPassword(password);
        user.setRegisterDate(new Date());
        userService.addUser(user);

        return new HttpResult(HttpResult.STATUS_SUCCESS, user.getId());
    }


}
