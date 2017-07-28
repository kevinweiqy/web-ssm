package com.heitian.ssm.mybatis_tutorial.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionFactoryUtil {

    private static SqlSessionFactory sqlSessionFactory;


    /*生成SqlSessionFactory的静态工厂方法*/
    public static SqlSessionFactory getSqlSessionFactory() {
        if (null == sqlSessionFactory) {
            InputStream inputStream;
            try {
                String resource = "mybatis-config.xml";
                inputStream = Resources.getResourceAsStream(resource);
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return sqlSessionFactory;
    }

    /*获取SqlSession*/
    public static SqlSession openSession() {
        return getSqlSessionFactory().openSession();
    }

    public static void main(String[] args) {
        openSession();
    }
}
