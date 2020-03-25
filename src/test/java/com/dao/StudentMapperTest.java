package com.dao;

import com.pojo.Student;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMapperTest {
    private ApplicationContext applicationContext;
    @Autowired
    private StudentMapper studentMapper;

    @Test
    public void insert() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");//加载spring配置文件
        studentMapper = applicationContext.getBean(StudentMapper.class);//在这里导入要测试的
        Student stu = new Student();
        stu = studentMapper.selectByPrimaryKey(6);
        System.out.println(stu.toString());

        //ApplicationContext act = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
        //studentMapper = act.getBean("studentMapper");
        //Student stu = studentMapper.selectByPrimaryKey(6);
        //System.out.println(stu.toString());
    }
}
