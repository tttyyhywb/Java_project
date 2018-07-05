package kevin.test.about

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class AboutController {

    @GetMapping(value = "/about")
    fun about(): String {
        return "Hello"
    }
}
