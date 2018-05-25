package kevin.test.about;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AboutController {

    @GetMapping(value = "/about")
    public String about(){
        return "Hello";
    }
}
