package kt.uz.javasiliaosystem.mapper

import kt.uz.javasiliaosystem.entity.CustomFodderEntity
import kt.uz.javasiliaosystem.entity.CfdStatusEntity
import org.apache.ibatis.annotations.*
import org.springframework.stereotype.Repository

@Mapper
@Repository
interface CustomFodderMapper {
    fun selectAllCustomFodder():List<CustomFodderEntity>
    fun insertCustomFodder(customFodderEntity:CustomFodderEntity)
    fun updateCustomFodder(customFodderEntity: CustomFodderEntity)
    fun deleteCustomFodder(cfId:String)
    fun selectCustomFodderById(cfId: String):CustomFodderEntity
    @Insert("INSERT INTO cfdstatus (customFodderId, status, isPass) VALUES (#{customFodderId}, #{status}, #{isPass})")
    fun insertCfdStatus(cfdStatus: CfdStatusEntity)

    @Select("SELECT * FROM customFodder WHERE customFodderId = #{customFodderId}")
    fun findById(customFodderId: Int): CustomFodderEntity

    @Select("SELECT * FROM cfdstatus WHERE customFodderId = #{customFodderId}")
    fun findStatusByCustomFodderId(customFodderId: Int): CfdStatusEntity

    @Update("UPDATE cfdstatus SET status = #{status}, isPass = #{isPass} WHERE customFodderId = #{customFodderId}")
    fun updateStatus(status: String, isPass: Boolean, customFodderId: Int)
}