package com.boss.ecommerceapp.data

data class User(
    val firstName: String,
    val lastName: String,
    val email: String,
    val imgUser: String = ""
) {
    constructor() : this("", "", "", "")
}
