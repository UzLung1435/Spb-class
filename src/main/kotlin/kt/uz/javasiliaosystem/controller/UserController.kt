package kt.uz.javasiliaosystem.controller

import kt.uz.javasiliaosystem.entity.UserEntity
import kt.uz.javasiliaosystem.service.impl.UserService
import org.springframework.web.bind.annotation.*
import javax.annotation.Resource
import javax.servlet.http.HttpServletRequest

@RestController
@RequestMapping("/api/user")
class UserController {

    @Resource
    lateinit var userService: UserService

    @RequestMapping("/getAll")
    @ResponseBody
    fun getAll(req:HttpServletRequest): List<UserEntity> {
        return userService.getAll()
    }
    @GetMapping("/getUserById")
    @ResponseBody
    fun getUserById(@RequestParam("uid") uid: Int): String? {
        return userService.getUserById(uid)
    }

}
