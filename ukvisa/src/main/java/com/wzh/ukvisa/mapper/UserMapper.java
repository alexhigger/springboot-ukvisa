package com.wzh.ukvisa.mapper;

import com.wzh.ukvisa.entities.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper {
    List<User> getUsers(User user);
    User getUserById(Integer id);
    int addUser(User user);
    int updateUser(User user);
    int deleteUserById(Integer id);
    User getUserByUsername(String username);//搜索框--根据用户名搜索

}
