package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @GetMapping("/")
    public String index() {
        // spring-webmvc 내의 org.springframework.web.servlet 하위 클래스가 redirect 처리.
        // DispatcherServlet이 ViewResolver에 넘기고 redirect: 처리.
        return "redirect:/question/list";
    }
}