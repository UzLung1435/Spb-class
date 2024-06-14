package kt.uz.javasiliaosystem.controller

import kt.uz.javasiliaosystem.entity.UserEntity
import kt.uz.javasiliaosystem.service.IUserService
import kt.uz.javasiliaosystem.service.impl.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController
import javax.annotation.Resource
import javax.servlet.http.HttpServletRequest

@RestController
@RequestMapping("/api/user")
class UserController {

    @Resource
    lateinit var userService: UserService

    @RequestMapping("/getAll")
    @ResponseBody
    fun getAll(req:HttpServletRequest): UserEntity{
        return userService.getAll()
    }

}