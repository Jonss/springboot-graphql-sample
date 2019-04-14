package jonss.com.github.graphqlsample

import jonss.com.github.graphqlsample.services.GithubService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class GraphqlSampleApplication {

	@Autowired
	private lateinit var githubService: GithubService

	@GetMapping("/git/user")
	fun findUser(@RequestParam("userName") userName: String) = githubService.fetchUser(userName)

}

fun main(args: Array<String>) {
	runApplication<GraphqlSampleApplication>(*args)
}


