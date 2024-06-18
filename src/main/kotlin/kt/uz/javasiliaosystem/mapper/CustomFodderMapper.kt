package kt.uz.javasiliaosystem.mapper

import kt.uz.javasiliaosystem.entity.CustomFodderEntity
import org.apache.ibatis.annotations.Insert
import org.apache.ibatis.annotations.Mapper
import org.springframework.stereotype.Repository

@Mapper
@Repository
interface CustomFodderMapper {
    @Insert("INSERT INTO customfodder(customFodderId, CFN, customFodderName, percent) values (#{cfd.fdName}, #{cfd.fdInfo.CFN}, #{cfd.fd})")
    fun addCustomFodder(cfd: CustomFodderEntity)
    fun getCustomFodder(cfId: String)
    fun getCustomFodderByName(cfName: String)
    fun updateCustomFodder(cfd: CustomFodderEntity)
    fun deleteCustomFodder(cfId: String)
    fun updateCustomFodderState(cfId: String, state: String)
    fun getAll(): List<CustomFodderEntity>
}