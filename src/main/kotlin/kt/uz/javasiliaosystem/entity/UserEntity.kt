package kt.uz.javasiliaosystem.entity

data class UserEntity(
     var userId:Int,
     var userName: String? = null,
     var passwd: String? = null,
     var userType:Int
)
