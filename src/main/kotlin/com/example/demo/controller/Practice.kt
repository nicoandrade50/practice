package com.example.demo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/hola")
class Practice {

    @GetMapping()
fun index():String{
        val age:Int=18
    return("/hola desde kotlin tengo $age años")
}


    @GetMapping("/{age}")
    fun indexage(@PathVariable age:Long):String{
        return("/hola desde kotlin tengo $age años")
    }

    @GetMapping("/{age}")
    fun appComportation(@PathVariable age:Long):String{
        return when(age){
            in 0.. 11->("niño")
            in 12 .. 17->("joven")
            in 18 .. 21 ->("Adulto Joven")
            in 22.. 64->("Adulto")
            in 65.. 80->("Adulto Mayor")

            else ->("no se")
        }
        return("edad $age")
    }

}
