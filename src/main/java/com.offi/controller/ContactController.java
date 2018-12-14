package com.offi.controller;

import com.offi.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ContactController {
    /**
     * 返回联系人列表
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("/contact")
    public String contact(@RequestParam(value="id",required = false,defaultValue="2")String id, Model model){
        model.addAttribute("id",id);
        return "contact";
    }

    /**
     * 返回添加联系人页面
     * @return
     */
    @RequestMapping("/addContact")
    public String addContact(){
        return "addContact";
    }

    /**
     * 添加联系人到数据库
     * @param name
     * @param tel
     * @param phone
     * @param qq
     */
    @Autowired
    private ContactService contactService;
    @RequestMapping("/addContData")
    @ResponseBody
    public String addContData(@RequestBody String name,@RequestBody String tel,@RequestBody String phone,@RequestBody String qq){
            if(contactService.addContact(name,tel,phone,qq)==1){
                return "success";
            }else{
                return "error";
            }
    }
}
