package kt.uz.javasiliaosystem.service

import kt.uz.javasiliaosystem.entity.CfdStatusEntity
import kt.uz.javasiliaosystem.entity.CustomFodderEntity
import kt.uz.javasiliaosystem.service.impl.CustomFodderService


interface ICustomFodderService {
    fun insertCustomFodder(customFodderEntity:CustomFodderEntity)
    fun updateCustomFodder(cfd: CustomFodderEntity)
    fun deleteCustomFodder(cfId: String)
    fun getAllCustomFodder():List<CustomFodderEntity>
    fun selectCustomFodderById(cfId: String):CustomFodderEntity
    fun updateStatus(status: String, isPass: Boolean, customFodderId: Int)
    fun getStatusByCustomFodderId(customFodderId: Int): CfdStatusEntity
    fun getCustomFodderById(customFodderId: Int): CustomFodderEntity
}