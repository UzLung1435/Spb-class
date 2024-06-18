package kt.uz.javasiliaosystem.service.impl

import kt.uz.javasiliaosystem.entity.MessageEntity
import kt.uz.javasiliaosystem.entity.UserAuthEntity
import kt.uz.javasiliaosystem.mapper.UserMapper
import kt.uz.javasiliaosystem.service.IMessageService
import org.springframework.stereotype.Service
import javax.annotation.Resource

@Service(value = "messageService")
class MessageService : IMessageService {
    @Resource
    lateinit var userMapper: UserMapper

    override fun isLoginSuccess(auth: UserAuthEntity): MessageEntity {
        val isSuccess = userMapper.loginCheck(auth.userId, auth.passwd)
        return MessageEntity(if (isSuccess) "success" else "Error", if (isSuccess) 1 else -1)
    }
}