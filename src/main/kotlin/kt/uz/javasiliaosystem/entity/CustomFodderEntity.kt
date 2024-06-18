package kt.uz.javasiliaosystem.entity

data class CustomFodderEntity(
    val fdName:String,
    val fdId:String,
    val fdType: String,
    val fdInfo:Map<RegularFodderEntity,Double>
)
