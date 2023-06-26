package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("hello") // get post할 때의 get
    public String hello(Model model){
        model.addAttribute("data", "hello!!");
        return "hello"; // hello.html을 찾아서 렌더링하는 것
        // resources > templates 내의 html을 찾음
    }
}
