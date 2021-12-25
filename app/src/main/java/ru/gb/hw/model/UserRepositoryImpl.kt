package ru.gb.hw.model

import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.ObservableEmitter
import io.reactivex.rxjava3.core.ObservableOnSubscribe
import java.util.concurrent.Callable


class UserRepositoryImpl: UserRepository {

    private val users: List<User> = listOf(
        User("user1","123"),
        User("user2", "123"),
        User("user3", "123")
    )



    override fun getUsers(): Observable<List<User>> {
        return Observable.just(users)
    }



    override fun getUserByLogin(userLogin: String, userPass: String): Observable<User> {

      return Observable.just(users).map { list -> list.first { user ->  user.login == userLogin && user.password == userPass } }

    }



}