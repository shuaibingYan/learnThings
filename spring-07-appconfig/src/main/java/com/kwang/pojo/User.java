package com.kwang.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author yan
 * @version 1.0
 * @date 2020/6/14 14:27
 */
@Component   //这个注解的意思是这个类被spring接管了，注册到了容器中
public class User {
    private String name;

    public String getName() {
        return name;
    }
    @Value("张三") //属性注入值
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
