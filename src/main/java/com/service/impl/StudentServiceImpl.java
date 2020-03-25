package com.service.impl;

import com.dao.StudentMapper;
import com.pojo.Student;
import com.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public int deleteByPrimaryKey(Integer sid) {
        return 0;
    }

    @Override
    public int insert(Student record) {
        return 0;
    }

    @Override
    public int insertSelective(Student record) {
        return 0;
    }

    @Override
    public Student selectByPrimaryKey(Integer sid) {
        return studentMapper.selectByPrimaryKey(sid);
    }

    @Override
    public int updateByPrimaryKeySelective(Student record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Student record) {
        return 0;
    }
}
