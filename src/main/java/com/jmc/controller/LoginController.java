package com.jmc.controller;

import com.jmc.pojo.Admin;
import com.jmc.pojo.Login;
import com.jmc.pojo.User;
import com.jmc.service.impl.AdminServiceImpl;
import com.jmc.service.impl.LoginServiceImpl;
import com.jmc.service.impl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
@RequestMapping("/login")
public class LoginController {
    @Resource
    private LoginServiceImpl loginService;
    @Resource
    private UserServiceImpl userService;
    @Resource
    private AdminServiceImpl adminService;

    @RequestMapping(value = "/validateLogin",method = RequestMethod.POST)
    public ModelAndView validateLogin(@RequestParam("id") String id,@RequestParam("password") String password,@RequestParam("identity") String identity){
        ModelAndView mv=new ModelAndView();
        Login login=loginService.validateLogin(id,password);
        if (login!=null&&identity.equals(login.getIdentity())){
            if ("0".equals(login.getIdentity())){
                User user=userService.queryUser(id);
                mv.addObject("user",user);
                mv.setViewName("userFrm");
            }else if ("1".equals(login.getIdentity())){
                Admin admin=adminService.queryAdmin(id);
                mv.addObject("admin",admin);
                mv.setViewName("adminFrm");
            }

        }else {
            mv.setViewName("fail");
        }
        return mv;
    }
}
