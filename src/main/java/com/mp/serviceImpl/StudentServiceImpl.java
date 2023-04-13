package com.mp.serviceImpl;

import com.mp.pojo.Student;
import com.mp.mapper.StudentMapper;
import com.mp.service.StudentService;
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
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {

}
