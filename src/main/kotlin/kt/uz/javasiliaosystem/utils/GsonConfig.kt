package kt.uz.javasiliaosystem.utils

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.converter.json.GsonHttpMessageConverter

@Configuration
class GsonConfig {

    @Bean
    fun gsonHttpMessageConverter(): GsonHttpMessageConverter {
        val gson = GsonBuilder().create()
        return GsonHttpMessageConverter(gson)
    }
}
