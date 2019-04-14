package jonss.com.github.graphqlsample.graphql

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import jonss.com.github.graphqlsample.models.GithubUser
import jonss.com.github.graphqlsample.services.GithubService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class Query: GraphQLQueryResolver {

    @Autowired
    private lateinit var githubService: GithubService

    fun user(userName: String): GithubUser? {
        return githubService.fetchUser(userName)
    }
}