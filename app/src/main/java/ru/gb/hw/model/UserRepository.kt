package ru.gb.hw.model

import io.reactivex.rxjava3.core.Observable


interface UserRepository {
   fun getUsers(): List<User>
   fun setUser(user: User)
   fun getUserByLogin(userLogin: String): User?
}