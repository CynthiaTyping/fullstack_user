package com.xinjie.usercenter.service;

import com.xinjie.usercenter.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;

/**
* @author Cynthia
* @description 针对表【user(用户表)】的数据库操作Service
* @createDate 2022-05-09 01:43:06
*/
public interface UserService extends IService<User> {


    String USER_LOGIN_STATE = "userLoginState";

    /**
     *
     * @param userAccount 账户
     * @param userPassword 密码
     * @param checkPassword 检查
     * @return
     */
    long userRegister(String userAccount, String userPassword, String checkPassword, String planetCode);

    User userLogin(String userAccount, String userPassword, HttpServletRequest request);
    /**
     * 用户脱敏
     *
     * @param originUser
     * @return
     */
    User getSafetyUser(User originUser);


    /**
     * 用户注销
     *
     * @param request
     * @return
     */
    int userLogout(HttpServletRequest request);


}
