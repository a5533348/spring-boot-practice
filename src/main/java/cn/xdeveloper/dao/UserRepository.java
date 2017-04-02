package cn.xdeveloper.dao;

import cn.xdeveloper.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by lai_book on 2017/4/2.
 */
public interface UserRepository extends JpaRepository<User,Long> {

    /**
     * 根据用户名和密码查询
     * @param account
     * @param password
     * @return
     */
    User findByAccountAndPassword(String account,String password);


}
