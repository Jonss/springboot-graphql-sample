package jonss.com.github.graphqlsample.repository

import jonss.com.github.graphqlsample.models.GithubUser
import okhttp3.Request
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit

@Component
class GithubComponent {

    @Autowired
    private lateinit var retrofit: Retrofit

    @Bean
    fun github() = retrofit.create(GithubAPI::class.java)

    fun findUser(userName: String): Response<GithubUser?> {
        val user = github().findUser(userName)
        return user.execute()
    }

}