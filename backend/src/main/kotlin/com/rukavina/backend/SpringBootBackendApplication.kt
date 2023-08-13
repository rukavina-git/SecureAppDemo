package com.rukavina.backend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import mu.KotlinLogging

@SpringBootApplication
class SpringBootBackendApplication

fun main(args: Array<String>) {
	val logger = KotlinLogging.logger {}
	runApplication<SpringBootBackendApplication>(*args)
	logger.info { "Backend running..." }
}
