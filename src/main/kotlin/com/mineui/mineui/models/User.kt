package com.mineui.mineui.models
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.GeneratedValue

@Entity
class User(
        @Id @GeneratedValue var id: Long? = null,
        var username: String,
        var hash: String,
)
