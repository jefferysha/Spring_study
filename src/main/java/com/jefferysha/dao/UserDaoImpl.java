package com.jefferysha.dao;

import com.jefferysha.entity.User;

import java.util.Collections;
import java.util.List;


/**
 * UserDaoImpl.
 *
 * @author jeffers
 * @date 2021/03/07
 */
public class UserDaoImpl {

    public UserDaoImpl(){

    }

    public List<User> findUserList(){
        List<User> userList = Collections.singletonList(new User("sjy", 18));
        return userList;
    }
}
