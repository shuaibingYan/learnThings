package com.kwang.pojo.config;

import com.kwang.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author yan
 * @version 1.0
 * @date 2020/6/14 14:29
 */
@Configuration   //也是component的一种，也会被spring容器托管，注册到容器中。代表这是一个配置类。和之前的beans.xml是一样的
@ComponentScan("com.kwang.pojo")
@Import(kwangConfig2.class)
public class kwangConfig{
    @Bean  //相当于之前写的一个bean标签  方法名字相当于bean标签的id属性  方法的返回值，相当于bean标签的class属性
    public User getUser(){
        return new User();  //返回要注入到bean的对象
    }

}
