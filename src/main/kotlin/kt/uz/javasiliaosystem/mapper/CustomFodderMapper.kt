package kt.uz.javasiliaosystem.mapper

import kt.uz.javasiliaosystem.entity.CustomFodderEntity
import org.apache.ibatis.annotations.Insert
import org.apache.ibatis.annotations.Mapper
import org.springframework.stereotype.Repository

@Mapper
@Repository
interface CustomFodderMapper {
    fun selectAllCustomFodder():List<CustomFodderEntity>
    fun insertCustomFodder(customFodderEntity:CustomFodderEntity)
    fun updateCustomFodder(customFodderEntity: CustomFodderEntity)
    fun deleteCustomFodder(cfId:String)
    fun selectCustomFodderById(cfId: String):CustomFodderEntity
}