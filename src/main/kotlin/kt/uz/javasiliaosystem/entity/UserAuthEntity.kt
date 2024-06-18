package kt.uz.javasiliaosystem.entity

data class UserAuthEntity(
    val userId: Int,
    var passwd: String?,
    var isAuthSucceed: Boolean = false
)
