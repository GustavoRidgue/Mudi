package br.com.mvc.RidgeMudi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class TestController {

    @GetMapping("welcome")
    public String welcome(HttpServletRequest request) {
        request.setAttribute("nome", "Gustavo Ridgue");
        return "welcome";
    }
}
