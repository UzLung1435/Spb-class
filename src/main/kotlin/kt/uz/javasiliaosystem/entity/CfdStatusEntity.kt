package kt.uz.javasiliaosystem.entity

data class CfdStatusEntity(
    val id: Int,
    var customFodderId: Int,
    val status: String,
    val isPass: Boolean
)
