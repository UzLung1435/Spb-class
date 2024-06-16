package kt.uz.javasiliaosystem.service.impl

import kt.uz.javasiliaosystem.entity.CustomFodderEntity
import kt.uz.javasiliaosystem.entity.RegularFodderEntity
import kt.uz.javasiliaosystem.mapper.RegularFodderMapper
import kt.uz.javasiliaosystem.service.IRegularFodderService
import org.springframework.stereotype.Service
import javax.annotation.Resource

@Service(value = "regularFodderService")
open class RegularFodderService:IRegularFodderService {

    @Resource
    lateinit var regularFodderMapper: RegularFodderMapper

    override fun getAll():List<RegularFodderEntity>{
        return regularFodderMapper.getAll()
    }

    override fun getRegularByName(fodderName: String): List<RegularFodderEntity> {
        return regularFodderMapper.getRegularByName(fodderName)
    }

    override fun getRegularById(rId: String): RegularFodderEntity {
        return regularFodderMapper.getRegularById(rId)
    }

    override fun getRegularByAttribute(fodderName: String, raNum: Double): RegularFodderEntity {
        return regularFodderMapper.getRegularByAttribute(fodderName, raNum)
    }

    override fun addCustomFodder(customFodder: CustomFodderEntity) {
        return regularFodderMapper.addCustomFodder(customFodder)
    }

}