package com.qun.blog.service;

import com.qun.blog.po.User;

public interface UserService {
    User checkUser(String username, String password);
}
