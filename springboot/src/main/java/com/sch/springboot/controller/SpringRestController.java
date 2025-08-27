package com.sch.springboot.controller;

import com.sch.springboot.dto.Member;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringRestController {
    //@ResponseBody 생략 가능 <-- @RestController
    @GetMapping("/spring-api")
    public Member SpringApi(@RequestParam String name, @RequestParam Integer age) {
        Member member = new Member();
        member.setName("홍길동");
        member.setAge(30);
        member.setAddress("서울");
        member.setSubject("스프링부트");
        return member;
    }
}
