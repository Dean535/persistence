package com.github.dean535.permission.entity

import com.github.dean535.api.entity.BaseEntity
import com.github.dean535.permission.entity.RolePermission
import com.github.dean535.permission.entity.User
import java.io.Serializable
import javax.persistence.*

@Entity
data class Role(
    var name: String?,

    @OneToMany(mappedBy = "role", fetch = FetchType.LAZY)
    var users: MutableList<User> = mutableListOf(),

    @OneToMany(cascade = [CascadeType.ALL], fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name = "role_id")
    val rolePermissions: MutableList<RolePermission> = mutableListOf()

) : BaseEntity(), Serializable {
    override fun toString(): String {
        return "Role(name='$name')"
    }
}
