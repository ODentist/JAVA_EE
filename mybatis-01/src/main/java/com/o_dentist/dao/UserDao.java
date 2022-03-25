package com.o_dentist.dao;

import com.o_dentist.pojo.User;

import javax.jnlp.ClipboardService;
import java.util.List;

public interface UserDao {
    public List<User> getUserList();
    public List<User> addUser(int id,String name,String pwd);
}