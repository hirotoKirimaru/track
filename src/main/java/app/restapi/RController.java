package app.restapi;

import app.domein.user;
import app.restapi.dto.aiueo;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("/")
public class RController {


    @PostMapping("/signup")
    public aiueo signup(@RequestBody SignupParam signupParam){

        return new aiueo("", new user("1","2","3","4"));
    }

    private class SignupParam {
        @NotNull
        @Min(6)
        @Max(20)
        public String user_id;
        @NotNull
        public String password;
    }


    @GetMapping("/users/{user_id}")
    public aiueo get(){


        return new aiueo("", new user("1","2","3","4"));
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
