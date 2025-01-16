package com.jefferysha;

import com.jefferysha.entity.User;
import com.jefferysha.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;
import java.util.function.Consumer;

public class App {

    /**
     * main interfaces.
     *
     * @param args args
     */
    public static void main(String[] args) {
        ClassPathXmlApplicationContext pathXmlApplicationContext = new ClassPathXmlApplicationContext("aspects.xml", "daos.xml", "services.xml");
        UserServiceImpl userService = pathXmlApplicationContext.getBean("userService", UserServiceImpl.class);
        List<User> userList = userService.findUserList();
        userList.forEach( user -> System.out.println("用户名:" + user.getName()  + "\n年龄:" + user.getAge()));
    }
}
