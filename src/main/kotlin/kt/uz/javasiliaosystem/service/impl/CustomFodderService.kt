package kt.uz.javasiliaosystem.service.impl

import com.google.gson.Gson
import kt.uz.javasiliaosystem.entity.CfdStatusEntity
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
        customFodderMapper.insertCustomFodder(customFodderEntity)
        lateinit var status: CfdStatusEntity
        status.customFodderId = customFodderEntity.fdId?.toInt()!!
        customFodderMapper.insertCfdStatus(status)
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

    override fun getCustomFodderById(customFodderId: Int): CustomFodderEntity {
        return customFodderMapper.findById(customFodderId)
    }

    override fun getStatusByCustomFodderId(customFodderId: Int): CfdStatusEntity {
        return customFodderMapper.findStatusByCustomFodderId(customFodderId)
    }

    override fun updateStatus(status: String, isPass: Boolean, customFodderId: Int) {
        customFodderMapper.updateStatus(status, isPass, customFodderId)
    }
}