package com.example.demo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/hello")
class Home {
    @GetMapping()
    fun index(): String? {

        val number: Int =1
        val name: String
        return "Greetings from Spring Boot!"
    }
}