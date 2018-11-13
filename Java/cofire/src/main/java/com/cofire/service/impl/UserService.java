package com.cofire.service.impl;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cofire.dao.domain.User;
import com.cofire.dao.domain.UserExample;
import com.cofire.dao.mapper.UserMapper;
import com.cofire.service.IUserService;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserMapper c_userMapper;

    @Override
    public User selectUserByUserNameAndPwd(String p_userName, String p_password) throws Exception {
        UserExample m_example = new UserExample();
        UserExample.Criteria m_criteria = m_example.createCriteria();
        m_criteria.andUserNameEqualTo(p_userName);
        m_criteria.andPasswdEqualTo(p_password);
        List<User> m_userList = c_userMapper.selectByExample(m_example);
        if (CollectionUtils.isNotEmpty(m_userList)) {
            return m_userList.get(0);
        }
        return null;
    }

}
