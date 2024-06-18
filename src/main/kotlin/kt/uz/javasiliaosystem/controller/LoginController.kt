package kt.uz.javasiliaosystem.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@Controller
@RestController
class LoginController {
    @RequestMapping("/login")
    fun onResponseLogin(model: Model): String {
        model.addAttribute("Title","LoginTitle")
        return "login"
    }
}