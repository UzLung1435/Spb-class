package kt.uz.javasiliaosystem.mapper

import kt.uz.javasiliaosystem.entity.CustomFodderEntity
import org.apache.ibatis.annotations.Mapper
import org.springframework.stereotype.Repository

@Mapper
@Repository
interface CustomFodderMapper {
    fun addCustomFodder(cfd: CustomFodderEntity)
    fun getCustomFodder(cfId: String)
    fun getCustomFodderByName(cfName: String)
    fun updateCustomFodder(cfd: CustomFodderEntity)
    fun deleteCustomFodder(cfId: String)
    fun updateCustomFodderState(cfId: String, state: String)
}