package kt.uz.javasiliaosystem.controller

import kt.uz.javasiliaosystem.entity.RegularFodderEntity
import kt.uz.javasiliaosystem.service.impl.RegularFodderService
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody
import javax.annotation.Resource

@Controller
@RequestMapping("/api/fodder/regular")
class RegularFodderController {
    @Resource
    lateinit var regularFodderService: RegularFodderService

    @RequestMapping("/getRegularByName")
    @ResponseBody
    fun getRegularByName(@RequestParam("name") name:String): RegularFodderEntity {
        return regularFodderService.getRegularByName("%$name%")
    }
}