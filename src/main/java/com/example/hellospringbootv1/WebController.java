package com.example.hellospringbootv1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//annotation
@Controller
public class WebController {

    //Method
    //To Map with your URL
    @RequestMapping("/hello")
    public String sayHello(Model model){
        System.out.println("Hello from Web Controller");
        model.addAttribute("message", "Let's learn this demo");
        return "hello";
    }
}
