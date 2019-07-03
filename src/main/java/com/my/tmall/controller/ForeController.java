package com.my.tmall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ForeController {

    @RequestMapping("food")
    public String food(){
        return "food";
    }
}
