package restapi;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class RController {


    @PostMapping("/signup")
    public String signup(){
        return "";
    }

    @GetMapping("/users/{user_id}")
    public String get(){
        return "";
    }

    @PatchMapping("/users/{user_id}")
    public String patch(){
        return "";
    }

    @PostMapping("/close")
    public String del(){
        return "";
    }
}
