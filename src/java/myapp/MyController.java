package myapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MyController {

    @GetMapping("/welcome")
    public @ResponseBody String welcome(){
        return "Hello";
    }
}
