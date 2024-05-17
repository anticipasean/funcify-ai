package funcify.ai

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

/**
 * @author smccarron
 * @created 2024-05-17
 */
@SpringBootApplication(scanBasePackages = ["funcify.ai"])
class FuncifyGenerativeAIApplication {

  companion object {
    @JvmStatic
    fun main(args: Array<String>) {
      SpringApplication.run(FuncifyGenerativeAIApplication::class.java, *args)
    }
  }
}
