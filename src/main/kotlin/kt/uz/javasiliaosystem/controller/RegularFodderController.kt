package kt.uz.javasiliaosystem.controller

import kt.uz.javasiliaosystem.entity.CustomFodderEntity
import kt.uz.javasiliaosystem.entity.RegularFodderEntity
import kt.uz.javasiliaosystem.service.impl.RegularFodderService
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*
import javax.annotation.Resource

@Controller
@RequestMapping("/fodder/regular")
class RegularFodderController {
    @Resource
    lateinit var regularFodderService: RegularFodderService

    @RequestMapping("/getAllFodders")
    fun getAllFodders(model: Model): String {
        val fodders = regularFodderService.getAll()
        model.addAttribute("fodders", fodders)
        return "fodderList"
    }
}