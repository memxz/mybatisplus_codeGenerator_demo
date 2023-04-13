package com.mp.serviceImpl;

import com.mp.pojo.User;
import com.mp.mapper.UserMapper;
import com.mp.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Cyrus
 * @since 2023-04-13 12:31:59
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
