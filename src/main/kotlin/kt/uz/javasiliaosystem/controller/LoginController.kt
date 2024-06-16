package kt.uz.javasiliaosystem.controller

import kt.uz.javasiliaosystem.entity.MessageEntity
import kt.uz.javasiliaosystem.entity.UserAuthEntity
import kt.uz.javasiliaosystem.entity.UserEntity
import kt.uz.javasiliaosystem.service.impl.MessageService
import kt.uz.javasiliaosystem.service.impl.UserService
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import javax.annotation.Resource


@Controller
@RestController("/")
class LoginController {

    @Resource
    lateinit var messageService: MessageService

    @Resource
    lateinit var userService: UserService

    @PostMapping("/loginCheck")
    fun onResponseLogin(@RequestParam userAuth: UserAuthEntity): MessageEntity {
        return messageService.isLoginSuccess(userAuth)
    }

    @PostMapping("/getLoginUserInfo")
    fun onGetLoginUserInfo(@RequestParam userAuth: UserAuthEntity): UserEntity {
        return userService.getUserInfo(userAuth)
    }

}