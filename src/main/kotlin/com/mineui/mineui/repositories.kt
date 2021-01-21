package com.mineui.mineui

import com.mineui.mineui.models.User
import org.springframework.data.repository.CrudRepository


interface UserRepository : CrudRepository<User, Long> {
    fun findById(login: String): User?
}