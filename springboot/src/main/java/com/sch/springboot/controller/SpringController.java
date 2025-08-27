package com.sch.springboot.controller;

import com.sch.springboot.dto.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class SpringController {

//    @ResponseBody
//    @GetMapping("/spring-api")
//    public String springApi(){
//        Member member = new Member();
//        System.out.println(member.getName());
//        System.out.println(member.getAge());
//        return member; //클라이언트 - String 문자열 전송
//    }
    @ResponseBody
    @PostMapping("/member-api")
    public Member memberApi(@ModelAttribute Member member) {
        return member; //view name
    }
    @GetMapping("/member")
    public String member(@RequestParam("name") String name,
                         @RequestParam("age") int age,
                         @RequestParam("address") String address,
                         Model model) {
        model.addAttribute("name",name);
        model.addAttribute("age",age);
        return "member"; //view name
    }
}
