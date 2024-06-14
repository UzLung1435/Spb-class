package kt.uz.javasiliaosystem.utils

import com.google.gson.Gson


object utils {
    fun onBuildUserJson(user: MutableMap<Any,Any>): String? {
        val gson = Gson()
        return gson.toJson(user)
    }
}