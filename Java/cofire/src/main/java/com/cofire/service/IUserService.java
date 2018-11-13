package com.cofire.service;

import com.cofire.dao.domain.User;

public interface IUserService {

    /**
     * 
     * @Title: selectUserByUserNameAndPwd
     * @author ly
     * @Description:
     * @param userId
     * @param password
     * @return
     * @throws Exception
     * @return User 返回类型
     */
    User selectUserByUserNameAndPwd(String userId, String password) throws Exception;
}
