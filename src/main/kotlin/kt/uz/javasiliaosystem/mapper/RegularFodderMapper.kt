package kt.uz.javasiliaosystem.mapper

import kt.uz.javasiliaosystem.entity.RegularFodderEntity
import org.apache.ibatis.annotations.Mapper
import org.springframework.stereotype.Repository

@Mapper
@Repository
interface RegularFodderMapper {
    fun getRegularByName(fodderName: String): RegularFodderEntity
    fun getRegularById(rId: String): RegularFodderEntity
    fun getRegularByAttribute(fodderName: String, raNum: Double): RegularFodderEntity
}