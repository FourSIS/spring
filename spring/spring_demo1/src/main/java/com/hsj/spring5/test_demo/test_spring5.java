package com.hsj.spring5.test_demo;

import com.hsj.spring5.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test_spring5 {
    @Test
    public void addTest() {
        // 1. 获取配置文件
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");

        // 2. 通过配置文件中的bean，创建对象(而不是通过new的方法)
        User user = context.getBean("user", User.class);

        // 3. 尝试 打印对象 和 调用对象的方法
        System.out.println(user);
        user.addUser();
    }
}
