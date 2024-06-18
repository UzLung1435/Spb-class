package kt.uz.javasiliaosystem.service.impl

import kt.uz.javasiliaosystem.entity.UserAuthEntity
import kt.uz.javasiliaosystem.entity.UserEntity
import kt.uz.javasiliaosystem.mapper.UserMapper
import kt.uz.javasiliaosystem.service.IUserService
import kt.uz.javasiliaosystem.utils.utils
import org.springframework.stereotype.Service
import javax.annotation.Resource

@Service(value = "userService")
open class UserService : IUserService{
    @Resource
    lateinit var userMapper: UserMapper

    override fun getAll(): List<UserEntity> {
        return userMapper.getAll()
    }

    override fun getUserById(userId: Int): String? {
        val userE = userMapper.getUserById(userId)
        var userTable = mutableMapOf<Any, Any>()
        userTable.put("userId", userE.userId.toString())
        userTable.put("userName", userE.userName.toString())
        userTable.put("userType", userE.userType)
        return utils.onBuildUserJson(userTable)
    }

    override fun getUserInfo(user: UserAuthEntity): UserEntity {
        return userMapper.getUserInfo(user)
    }
}