package com.sofia.employee

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@EnableEurekaClient
@SpringBootApplication
class EmployeeApplication

fun main(args: Array<String>) {
	runApplication<EmployeeApplication>(*args)
}
