package com.wxit.gmall.user.controller;

import com.wxit.gmall.user.bean.UmsMember;
import com.wxit.gmall.user.bean.UmsMemberReceiveAddress;
import com.wxit.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author : wj
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "hello";
    }

    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){

        List<UmsMember> umsMembers = userService.getAllUser();

        return umsMembers;
    }

    @RequestMapping("UmsMemberReceiveAddress")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId){

        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = userService.UmsMemberReceiveAddress(memberId);

        return umsMemberReceiveAddresses;
    }

}
