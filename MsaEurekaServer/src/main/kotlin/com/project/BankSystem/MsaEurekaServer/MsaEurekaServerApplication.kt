package com.project.BankSystem.MsaEurekaServer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@EnableEurekaServer
@SpringBootApplication
class MsaEurekaServerApplication

fun main(args: Array<String>) {
	runApplication<MsaEurekaServerApplication>(*args)
}
