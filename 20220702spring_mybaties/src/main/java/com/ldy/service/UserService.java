package com.ldy.service;

import com.ldy.lei.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.context.annotation.Bean;

import java.util.List;

/**
 * @author : ldy
 * @version : 1.0
 */

public interface UserService {

    int insert(User user);


    int delete(int id);


    int update(User user);


    List<User> getAll();


    List<User> getByName(String username);
}
