package kt.uz.javasiliaosystem.service

import kt.uz.javasiliaosystem.entity.CustomFodderEntity
import kt.uz.javasiliaosystem.entity.RegularFodderEntity

interface IRegularFodderService {

    fun getAll():List<RegularFodderEntity>
    fun getRegularByName(fodderName: String): List<RegularFodderEntity>
    fun getRegularById(rId: String): RegularFodderEntity
    fun getRegularByAttribute(fodderName: String, raNum: Double): RegularFodderEntity
    fun addFodder(regularFodderEntity: RegularFodderEntity)
    fun updateFodder(regularFodderEntity: RegularFodderEntity)
    fun deleteFodder(rId: String)
}