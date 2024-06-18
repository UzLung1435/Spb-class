package kt.uz.javasiliaosystem.mapper

import kt.uz.javasiliaosystem.entity.CustomFodderEntity
import kt.uz.javasiliaosystem.entity.RegularFodderEntity
import org.apache.ibatis.annotations.Mapper
import org.springframework.stereotype.Repository

@Mapper
@Repository
interface RegularFodderMapper {
    fun getAll(): List<RegularFodderEntity>
    fun getRegularByName(fodderName: String): List<RegularFodderEntity>
    fun getRegularById(rId: String): RegularFodderEntity
    fun getRegularByAttribute(fodderName: String, raNum: Double): RegularFodderEntity
    fun addFodder(regularFodderEntity: RegularFodderEntity)
    fun updateFodder(regularFodderEntity: RegularFodderEntity)
    fun deleteFodder(rId: String)
}