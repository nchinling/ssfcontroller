package sg.nus.iss.edu.sg.controller.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping(path="/")
public class appController {

    @GetMapping(path="/hi")
    public String sayHi(){
        return "hi";
    }

    @GetMapping(path="/shan")
    public String shan(){
        return "shan";
    }

    @GetMapping(path="/ling")
    public String ling(){
        return "ling";
    }
    
}
