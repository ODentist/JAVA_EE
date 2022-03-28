package com.o_dentist.dao;

import com.o_dentist.pojo.User;
import org.apache.ibatis.annotations.Param;

import javax.jnlp.ClipboardService;
import java.util.List;

public interface UserDao {
    public List<User> getUserList();
    public void addUser(User user);
    public void deleteUser(String name);
    public void updateUser(User user);
}