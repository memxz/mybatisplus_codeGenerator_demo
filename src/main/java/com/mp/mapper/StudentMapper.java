package com.mp.mapper;

import com.mp.pojo.Student;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Cyrus
 * @since 2023-04-13 12:31:59
 */
@Mapper
public interface StudentMapper extends BaseMapper<Student> {

}
