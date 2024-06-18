package kt.uz.javasiliaosystem.service.impl

import kt.uz.javasiliaosystem.entity.CustomFodderEntity
import kt.uz.javasiliaosystem.mapper.CustomFodderMapper
import kt.uz.javasiliaosystem.service.ICustomFodderService
import org.springframework.stereotype.Service
import javax.annotation.Resource

@Service(value = "customFodderService")
class CustomFodderService: ICustomFodderService {

    @Resource
    lateinit var customFodderMapper: CustomFodderMapper
    override fun insertCustomFodder(customFodderEntity: CustomFodderEntity) {
        return customFodderMapper.insertCustomFodder(customFodderEntity)
    }

    override fun updateCustomFodder(cfd: CustomFodderEntity) {
        return customFodderMapper.updateCustomFodder(cfd)
    }

    override fun deleteCustomFodder(cfId: String) {
        return customFodderMapper.deleteCustomFodder(cfId)
    }

    override fun getAllCustomFodder(): List<CustomFodderEntity> {
        return customFodderMapper.selectAllCustomFodder()
    }

    override fun selectCustomFodderById(cfId: String): CustomFodderEntity {
        return customFodderMapper.selectCustomFodderById(cfId)
    }
}