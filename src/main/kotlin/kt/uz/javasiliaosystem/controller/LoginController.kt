package kt.uz.javasiliaosystem.controller

import kt.uz.javasiliaosystem.entity.UserEntity
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping


@Controller
@RequestMapping("/")
class LoginController {
    @RequestMapping("/login")
    fun onResponseLogin(model: Model): String {
        model.addAttribute("Title","LoginTitle")
        return "login"
    }

    @RequestMapping("/")
    fun redi():String{
        return "redirect:index"
    }

    @RequestMapping("/index")
    fun redit():String{
        return "index"
    }

}