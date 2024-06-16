package kt.uz.javasiliaosystem.service

import kt.uz.javasiliaosystem.entity.UserAuthEntity
import kt.uz.javasiliaosystem.entity.UserEntity

interface IUserService {
    fun getAll(): List<UserEntity>
    fun getUserById(userId:Int): String?
    fun getUserInfo(user: UserAuthEntity) : UserEntity
}