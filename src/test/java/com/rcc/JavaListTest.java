package com.rcc;

import com.rcc.entity.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * com.rcc
 * 测试一些日常List操作
 * @author rencc
 * @Note
 * @Date 2017-09-04 14:05
 */
public class JavaListTest {
    @Test
    public void listText() throws Exception {
        User user = new User();
        user.setId(1);
        user.setName("张三");
        List<User> list = new ArrayList<>();
        list.add(user);
        list.add(user);
        list.add(user);
        List<User> userList = new ArrayList<>();
        /**
         * JDK 1.8特性
         */
        list.stream().forEach(
                p -> {
                    if (!userList.contains(p)) {
                        userList.add(p);
                    }
                }
        );
        System.out.println(userList);
        System.out.println(list);
    }
}
