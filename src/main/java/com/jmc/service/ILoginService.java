package com.jmc.service;

import com.jmc.pojo.Login;

public interface ILoginService {
    Login validateLogin(String id,String password);
}
