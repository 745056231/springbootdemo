package com.javasm.springbootdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
@MapperScan("com.javasm.springbootdemo.*.dao")//扫描dao目录下的mapper
@EnableTransactionManagement // 事务开启,然后就要在需要事务管理的实现方法(一般是增删改的方法)上添加@Transactional注解就行了
//也可以在实现类上加@Transactional,相当于整个类里的方法都加入了事务
@EnableCaching   //开启缓存注解
@EnableScheduling //开启定时任务
public class SpringbootdemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootdemoApplication.class, args);
    }


}

