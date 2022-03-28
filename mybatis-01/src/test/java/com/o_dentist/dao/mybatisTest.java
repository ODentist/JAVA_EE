package com.o_dentist.dao;

import com.o_dentist.pojo.User;
import com.o_dentist.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

public class mybatisTest {
    @Test
    public void test() {

        //1.获取SqlSession对象-getconnection()
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //2.执行SQL
        // 方式一：getMapper
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<User> userList = userDao.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }

        //关闭sqlSession
        sqlSession.close();
    }

    @Test
    public void Insert() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
//        User user = new User(4, "赵四", "12306");
//        try {
//            mapper.addUser(user);
//            sqlSession.commit();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        sqlSession.close();
    }
}


