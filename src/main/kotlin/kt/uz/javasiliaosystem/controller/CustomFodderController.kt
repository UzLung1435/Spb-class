package kt.uz.javasiliaosystem.controller

import kt.uz.javasiliaosystem.service.ICustomFodderService
import kt.uz.javasiliaosystem.service.impl.CustomFodderService
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import javax.annotation.Resource

@Controller
@RequestMapping("/api/fodder/custom")
class CustomFodderController {
    @Resource
    lateinit var customFodderService: CustomFodderService




}