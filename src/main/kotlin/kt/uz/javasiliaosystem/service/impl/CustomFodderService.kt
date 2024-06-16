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

    override fun addCustomFodder(cfd: CustomFodderEntity) {
        return customFodderMapper.addCustomFodder(cfd)
    }

    override fun getCustomFodder(cfId: String) {
        return customFodderMapper.getCustomFodder(cfId)
    }

    override fun getCustomFodderByName(cfName: String) {
        return customFodderMapper.getCustomFodderByName(cfName)
    }

    override fun updateCustomFodder(cfd: CustomFodderEntity) {
        return customFodderMapper.updateCustomFodder(cfd)
    }

    override fun deleteCustomFodder(cfId: String) {
        return customFodderMapper.deleteCustomFodder(cfId)
    }

    override fun updateCustomFodderState(cfId: String, state: String) {
        return customFodderMapper.updateCustomFodderState(cfId,state)
    }
}