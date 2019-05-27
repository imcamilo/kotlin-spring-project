package cl.obj.starter

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling


@SpringBootApplication
@EnableScheduling
class Main

fun main(args: Array<String>) {
	runApplication<Main>(*args)
}