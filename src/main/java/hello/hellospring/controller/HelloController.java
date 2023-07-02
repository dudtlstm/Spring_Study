package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("hello") // get post할 때의 get
    public String hello(Model model){
        model.addAttribute("data", "hello!!");
        return "hello"; // hello.html을 찾아서 렌더링하는 것
        // resources > templates 내의 html을 찾음
    }

    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam(value = "name", required = false) String name, Model model){
        model.addAttribute("name", name);
        return "hello-template";
    }

    @GetMapping("hello-string")
    @ResponseBody // html에 나오는 body 태그 X. http의 body부에 해당 데이터를 넣을 것이라는 뜻
    public String helloString(@RequestParam("name") String name){
        return "hello " + name;
    }

    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name) {
        Hello hello = new Hello();
        hello.setName(name);
        return hello;
    }

    static class Hello {
        private String name;

        // Getter Setter 사용
/*        public String getName() {
            return name;
        }*/

        public void setName(String name) {
            this.name = name;
        }
    }
}
