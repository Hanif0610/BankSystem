package com.project.BankSystem.MsaClientUser

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@EnableEurekaClient
@SpringBootApplication
class MsaClientUserApplication

fun main(args: Array<String>) {
	runApplication<MsaClientUserApplication>(*args)
}
