package com.offi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {
    @RequestMapping("/contact")
    public String contact(@RequestParam(value="id",required = false,defaultValue="2")String id, Model model){
        model.addAttribute("id",id);
        return "contact";
    }

    @RequestMapping("/addContact")
    public String addContact(){
        return "addContact";
    }
}
