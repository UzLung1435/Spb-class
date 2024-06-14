package kt.uz.javasiliaosystem.service

import kt.uz.javasiliaosystem.entity.UserEntity

interface IUserService {
    fun getAll(): UserEntity
    fun getUserById(userId:Int): String?
}