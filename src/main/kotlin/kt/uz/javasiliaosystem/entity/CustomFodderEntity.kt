package kt.uz.javasiliaosystem.entity

data class CustomFodderEntity(
    val fdName: String, //自定义饲料的名称
    var fdId: String?, //id，随机的
    val fdType: String, //饲料类别。总不能我写个enum吧
    val fdInfo: String //这里直接用CFN强指定得了
)
