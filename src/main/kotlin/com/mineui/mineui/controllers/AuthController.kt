package com.mineui.mineui.controllers

import com.mineui.mineui.UserRepository
import org.springframework.stereotype.Controller
import org.springframework.stereotype.Repository
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.*

data class Credentials(val username: String, val password: String)

@RestController
class AuthController(private val userRepository: UserRepository) {

    @GetMapping("/auth/token/")
    fun token(): IntArray {
        return intArrayOf(1, 2, 3)
    }

    @PostMapping("/auth/login/")
    fun login(@RequestBody requestBody: Credentials) : Any {
        return true;
    }
}