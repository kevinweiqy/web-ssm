package com.heitian.ssm.mybatis_tutorial.test;

import com.heitian.ssm.mybatis_tutorial.mappers.StudentMapper;
import com.heitian.ssm.mybatis_tutorial.model.Student;
import com.heitian.ssm.mybatis_tutorial.utils.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;

public class StudentTest {
    public static void main(String[] args) {
        SqlSession sqlSession = SqlSessionFactoryUtil.openSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        Student student = new Student("陈明", 23);
        int result = studentMapper.add(student);
        if (result > 0) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
        /*System.out.println(result);

        System.out.println("Hello mojo");*/


    }
}
