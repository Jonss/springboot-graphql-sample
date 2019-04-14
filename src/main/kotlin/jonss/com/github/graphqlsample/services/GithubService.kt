package jonss.com.github.graphqlsample.services

import jonss.com.github.graphqlsample.models.GithubUser
import jonss.com.github.graphqlsample.repository.GithubComponent
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class GithubService {

    @Autowired
    private lateinit var githubComponent: GithubComponent

    fun fetchUser(userName: String): GithubUser? {
        val findUser = githubComponent.findUser(userName = userName)
        return findUser.body()
    }
}