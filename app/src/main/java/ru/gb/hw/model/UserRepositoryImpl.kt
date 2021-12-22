package ru.gb.hw.model

import io.reactivex.rxjava3.core.Observable


class UserRepositoryImpl: UserRepository {

    private val users: List<User> = listOf(
        User("user1","123"),
        User("user2", "123"),
        User("user3", "123")
    )



    override fun getUsers(): List<User> {
         return users
    }

    override fun setUser(user: User) {
        TODO("Not yet implemented")
    }



    override fun getUserByLogin(userLogin: String): User? {
        return users.findLast {it.login == userLogin }

    }


}