package kt.uz.javasiliaosystem.mapper

import kt.uz.javasiliaosystem.entity.UserEntity
import org.apache.ibatis.annotations.Mapper
import org.springframework.stereotype.Repository

@Mapper
@Repository
interface UserMapper {
    fun getAll(): List<UserEntity>
    fun getUserById(userId: Int): UserEntity
}
