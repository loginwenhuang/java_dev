package com.wen.service.impl;

import com.github.abel533.entity.Example;
import com.wen.entity.User;
import com.wen.mapper.UserMapper;
import com.wen.service.ILoginService;
import com.wen.util.Md5Util;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/8/25 17:40
 */

@Service
public class LoginUserServiceImpl implements ILoginService {

    @Resource
    private UserMapper userMapper;

    @Override
    public int userLogin(User user) {
        Example example = new Example(User.class);
        example.createCriteria().andEqualTo("userName",user.getUserName());
        List<User> users = userMapper.selectByExample(example);
        if(users.size()==1){
            User oldUser = users.get(0);
            String salt = oldUser.getSalt();
            String password = user.getPassword();
            if(oldUser.getPassword().equals(Md5Util.getHash(password,salt))){
                return 1;
            }
        }
        return 0;
    }

    @Override
    public int insertUser(User user) {
        System.out.println(user);
        Example example = new Example(User.class);
        example.createCriteria().andEqualTo("userName",user.getUserName());
        List<User> users = userMapper.selectByExample(example);
        if(users.size()==0){
            String password = user.getPassword();
            user.setSalt(Md5Util.getSalt());
            user.setPassword(Md5Util.getHash(password,user.getSalt()));

            userMapper.insert(user);
            return 1;
        }
        return 0;
    }
}
