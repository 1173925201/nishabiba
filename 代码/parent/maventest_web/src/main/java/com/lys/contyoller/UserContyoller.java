package com.lys.contyoller;

import com.lys.domian.User;
import com.lys.service.UserServiceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path = "user")
public class UserContyoller {

    @Autowired
    private UserServiceMapper userServiceMapper;

    @RequestMapping(path = "findOne")
    public ModelAndView findOne(int id,ModelAndView modelAndView){

        User user = userServiceMapper.findOne(id);
        modelAndView.addObject("user",user);
        modelAndView.setViewName("hello");
        System.out.println(user);
        return modelAndView;


    }
}
