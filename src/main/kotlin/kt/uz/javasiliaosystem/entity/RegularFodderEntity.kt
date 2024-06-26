package kt.uz.javasiliaosystem.entity

data class RegularFodderEntity(
    val xid: Int,
    val CFN: String,
    val fodderName: String,
    val fodderDescription: String?,
    val dryMatter: Double?,
    val crudeProtein: Double?,
    val crudeFat: Double?,
    val crudeFiber: Double?,
    val nitrogenFreeExtract: Double?,
    val crudeAsh: Double?,
    val neutralDetergentFiber: Double?,
    val acidDetergentFiber: Double?,
    val starch: Double?,
    val calcium: Double?,
    val totalPhosphorus: Double?,
    val availablePhosphorus: Double?
)
