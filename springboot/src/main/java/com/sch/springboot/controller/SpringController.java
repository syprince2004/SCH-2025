package com.sch.springboot.controller;

import com.sch.springboot.dto.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SpringController {
    @GetMapping("/spring")
    public String spring(@RequestParam("name") String name,
                         @RequestParam("age") int age,
                         @RequestParam("address") String address,
                         Model model) {
        model.addAttribute("name",name);
        model.addAttribute("age",age);
        return "spring"; //view name
    }

    @GetMapping("/member")
    public String member(@ModelAttribute Member member,
                         Model model) {

        model.addAttribute("member",member);
        return "member"; //view name
    }
}
