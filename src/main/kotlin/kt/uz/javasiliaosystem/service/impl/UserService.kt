package kt.uz.javasiliaosystem.service.impl

import kt.uz.javasiliaosystem.entity.UserEntity
import kt.uz.javasiliaosystem.mapper.UserMapper
import kt.uz.javasiliaosystem.service.IUserService
import org.springframework.stereotype.Service
import javax.annotation.Resource

@Service(value = "userService")
open class UserService : IUserService{
    @Resource
    lateinit var userMapper: UserMapper

    override fun getAll(): UserEntity {
        return userMapper.getAll()
    }
}