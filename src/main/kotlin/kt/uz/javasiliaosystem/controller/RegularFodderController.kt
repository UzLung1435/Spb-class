package kt.uz.javasiliaosystem.controller

import kt.uz.javasiliaosystem.entity.CustomFodderEntity
import kt.uz.javasiliaosystem.entity.RegularFodderEntity
import kt.uz.javasiliaosystem.service.impl.RegularFodderService
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*
import javax.annotation.Resource

@Controller
@RequestMapping("/fodder/regular")
class RegularFodderController {
    @Resource
    lateinit var regularFodderService: RegularFodderService

    val logger = LoggerFactory.getLogger(this.javaClass)

    @RequestMapping("/getByName")
    @ResponseBody
    fun getRegularByName(@RequestParam("name") name:String): List<RegularFodderEntity> {
        logger.info("Input: $name")
        logger.info("查询词： %$name%")
        return regularFodderService.getRegularByName("%$name%")
    }

    @RequestMapping("/getAllFodders")
    @ResponseBody
    fun getAllFodders():List<RegularFodderEntity>{
        return regularFodderService.getAll()
    }

}