package jonss.com.github.graphqlsample.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import retrofit2.Retrofit
import retrofit2.converter.jackson.JacksonConverterFactory

private const val githubAPI = "https://api.github.com"

@Configuration
class RetrofitConfig {

    @Bean
    fun retrofit() = Retrofit.Builder()
            .addConverterFactory(JacksonConverterFactory.create())
            .baseUrl(githubAPI).build()

}
