package com.zyw.demo.alice.service.impl;

import com.zyw.demo.alice.entity.User;
import com.zyw.demo.alice.mapper.UserMapper;
import com.zyw.demo.alice.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zyw
 * @since 2019-09-24
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
