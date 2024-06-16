package kt.uz.javasiliaosystem.mapper

import kt.uz.javasiliaosystem.entity.UserAuthEntity
import kt.uz.javasiliaosystem.entity.UserEntity
import org.apache.ibatis.annotations.Mapper
import org.springframework.stereotype.Repository

@Mapper
@Repository
interface UserMapper {
    fun getAll(): List<UserEntity>
    fun getUserById(userId: Int): UserEntity
    fun loginCheck(userId: Int, passwd: String?): Boolean
    fun getUserInfo(userAuthEntity: UserAuthEntity): UserEntity

}
