package com.abhinav.springdemo.mainpackage

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/mapping")
class SpringController {
    @Autowired
    lateinit var reporsotory: ReportSubscriptionRepository

    @GetMapping("/springtest")
    fun blog(): Int {
        return (reporsotory.findById(5000)).get().subscriptionId
    }
}