package com.example.koindependancy

class UserRepository(private val api:GithubApi) {


    fun getAllUsers() = api.getUser()
}