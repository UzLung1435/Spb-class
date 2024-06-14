package kt.uz.javasiliaosystem.mapper

import kt.uz.javasiliaosystem.entity.UserEntity
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Select
import org.springframework.stereotype.Repository

@Mapper
@Repository
interface UserMapper {
    fun getAll(): UserEntity
}
