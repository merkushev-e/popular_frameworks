package ru.gb.hw.model

interface UserRepository {
   fun getUser(): User
   fun setUser(user: User)
}