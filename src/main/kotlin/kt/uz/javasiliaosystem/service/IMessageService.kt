package kt.uz.javasiliaosystem.service

import kt.uz.javasiliaosystem.entity.MessageEntity
import kt.uz.javasiliaosystem.entity.UserAuthEntity

interface IMessageService {
    fun isLoginSuccess(auth: UserAuthEntity): MessageEntity
}