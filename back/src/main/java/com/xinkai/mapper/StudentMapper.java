package com.xinkai.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xinkai.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface StudentMapper extends BaseMapper<Student> {
}
