package ldy.service;

import ldy.lei.User;

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
