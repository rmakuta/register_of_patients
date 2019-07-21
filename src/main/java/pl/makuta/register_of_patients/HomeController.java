package pl.makuta.register_of_patients;

import lombok.extern.java.Log;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Log
public class HomeController {

    @RequestMapping("/home")
    public String homeAction(){
        return "home";
    }

    //logi
    @GetMapping("/")
    @ResponseBody
    public String home(){
        log.info("Info mesage");
        log.warning("war");
//        log.error("error message");
        return "home";
    }

    @GetMapping("/about")
    @ResponseBody
    public String about() {
        return "Here you can find some details for logged users";
    }
}
