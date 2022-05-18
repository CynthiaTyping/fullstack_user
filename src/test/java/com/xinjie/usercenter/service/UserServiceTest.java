//package com.xinjie.usercenter.service;
//import java.util.Date;
//
//import com.xinjie.usercenter.model.domain.User;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.context.annotation.PropertySource;
//
//import javax.annotation.Resource;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//
//
//@MapperScan("com.xinjie.usercenter.mapper")
//@SpringBootTest
//class UserServiceTest {
//
//    @Resource
//    private UserService userService;
//
//    @Test
//    public void testAddUser()  {
//        User user = new User();
//        user.setUsername("testxinjie");
//        user.setUserAccount("123");
//        user.setAvatarUrl("https://636f-codenav-8grj8px727565176-1256524210.tcb.qcloud.la/img/logo.png");
//        user.setGender(0);
//        user.setUserPassword("123");
//        user.setPhone("123");
//        user.setEmail("123");
//
//        boolean result = userService.save(user);
//        System.out.println(user.getId());
//        System.out.println(result);
//        Assertions.assertTrue(result);
//    }
//
//    @Test
//    void userRegister() {
//        String userAccount = "xinjieBye";
//        String userPassword = "12345678";
//        String checkPassword = "12345678";
//        String planetCode = "4321";
//        long result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
//        Assertions.assertTrue(result<0);
//    }
//}