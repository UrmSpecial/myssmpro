package com.ct.controller;

import com.ct.mapper.RoleMapper;
import com.ct.pojo.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("loginController")
public class LoginController {
    private RoleMapper roleMapper;
    @Autowired
    public LoginController(RoleMapper roleMapper) {
        this.roleMapper = roleMapper;
    }

    @RequestMapping(value = "/toLogin", method = RequestMethod.GET)
    public String toLogin() {
        return "login";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/login")
    public String login(Role role, Model model) {
        if (roleMapper.existsRole(role)) {
            model.addAttribute("role", role);
            return "success";
        } else {
            return "login";
        }
    }

}
