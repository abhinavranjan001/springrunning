package com.abhinav.springdemo.mainpackage

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MainpackageApplication

fun main(args: Array<String>) {
    runApplication<MainpackageApplication>(*args)
}
