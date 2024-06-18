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

    @RequestMapping("/allFodders")
    fun allFodders(model: Model): String {
        val fodders = regularFodderService.getAll()
        model.addAttribute("fodders", fodders)
        return "fodderList"
    }

    @RequestMapping("/getRegularByName")
    fun getRegularByName(@RequestParam fodderName: String, model: Model): String {
        val fodders = regularFodderService.getRegularByName(fodderName)
        model.addAttribute("fodders", fodders)
        return "fodderList"
    }

    @RequestMapping("/getRegularById")
    fun getRegularById(@RequestParam rId: String, model: Model): String {
        val fodder = regularFodderService.getRegularById(rId)
        model.addAttribute("fodder", fodder)
        return "fodderDetail"
    }

    @RequestMapping("/getRegularByAttribute")
    fun getRegularByAttribute(@RequestParam fodderName: String, @RequestParam raNum: Double, model: Model): String {
        val fodder = regularFodderService.getRegularByAttribute(fodderName, raNum)
        model.addAttribute("fodder", fodder)
        return "fodderDetail"
    }

    @RequestMapping("/addFodder")
    fun addFodder(@ModelAttribute regularFodderEntity: RegularFodderEntity, model: Model): String {
        regularFodderService.addFodder(regularFodderEntity)
        model.addAttribute("fodder", )
        model.addAttribute("message", "Fodder added successfully")
        return "redirect:/fodder/regular/allFodders"
    }

    @RequestMapping("/deleteFodder")
    fun deleteFodder(@RequestParam("fId") fId: String, model: Model): String {
        regularFodderService.deleteFodder(fId)
        model.addAttribute("message", "Fodder deleted successfully")
        return "redirect:/fodder/regular/allFodders"
    }

    @RequestMapping("/toUpdateFodder")
    fun toUpdateFodder(fId: String, model: Model): String {
        val fdList = regularFodderService.getRegularById(fId)
        model.addAttribute("fodder", fdList)
        return "updateFodder"
    }
    @RequestMapping("/updateFodder")
    fun updateFodder(@ModelAttribute fodder: RegularFodderEntity, model: Model): String {
        regularFodderService.updateFodder(fodder)
        return "redirect:/fodder/regular/allFodders"
    }
}