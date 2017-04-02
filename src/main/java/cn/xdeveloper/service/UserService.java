package cn.xdeveloper.service;

import cn.xdeveloper.dao.UserRepository;
import cn.xdeveloper.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by lai_book on 2017/4/2.
 */
@Service
@Transactional
public class UserService {

    @Resource
    private UserRepository userRepository;

    public User login(String account, String password) {
        return userRepository.findByAccountAndPassword(account, password);
    }

    public User addUser(User user) {
        return userRepository.save(user);
    }
}
