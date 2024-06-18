package kt.uz.javasiliaosystem.controller

import kt.uz.javasiliaosystem.entity.CustomFodderEntity
import kt.uz.javasiliaosystem.service.ICustomFodderService
import kt.uz.javasiliaosystem.service.impl.CustomFodderService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import javax.annotation.Resource
import kotlin.random.Random

@Controller
@RequestMapping("/fodder/custom")
class CustomFodderController {
    @Resource
    lateinit var customFodderService: CustomFodderService

    @RequestMapping("/customFd")
    fun getAll(model: Model): String {
        val customFdList = customFodderService.getAllCustomFodder()
        model.addAttribute("cfdList", customFdList)
        return "customFodder"
    }

    @RequestMapping("/add")
    fun add(customFodderEntity: CustomFodderEntity): String {
        val random = Random(10)
        var cfidr = ""
        for (i in 1 .. 5) {
            cfidr += random.nextInt(10)
        }
        customFodderEntity.fdId = cfidr
        customFodderService.insertCustomFodder(customFodderEntity)
        return "redirect:customFodder"
    }
    @RequestMapping("/update")
    fun update(customFodderEntity: CustomFodderEntity):String{
        val reqfdid = customFodderEntity.fdId
        val getit = reqfdid?.let { customFodderService.selectCustomFodderById(it) }
        if (getit != null)
            customFodderService.updateCustomFodder(customFodderEntity)
        return "redirect:customFodder"
    }
    @RequestMapping("/delete")
    fun delete(cfdid: String): String {
        customFodderService.deleteCustomFodder(cfdid)
        return "redirect:customFodder"
    }

}