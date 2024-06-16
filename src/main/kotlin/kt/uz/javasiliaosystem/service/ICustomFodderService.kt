package kt.uz.javasiliaosystem.service

import kt.uz.javasiliaosystem.entity.CustomFodderEntity


interface ICustomFodderService {
    fun addCustomFodder(cfd: CustomFodderEntity)
    fun getCustomFodder(cfId: String)
    fun getCustomFodderByName(cfName: String)
    fun updateCustomFodder(cfd: CustomFodderEntity)
    fun deleteCustomFodder(cfId: String)
    fun updateCustomFodderState(cfId: String, state: String)
}