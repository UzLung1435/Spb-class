package kt.uz.javasiliaosystem.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@Controller
@RestController
class LoginController {
    @RequestMapping("/")
    fun onResponseLogin(): String {
        return "redirect:index.html"
    }
}