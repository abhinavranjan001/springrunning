package com.abhinav.springdemo.mainpackage

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/mapping")
class SpringController {

    @GetMapping("/springtest")
    fun blog(): String {
        return "test_spring"
    }
}