package ru.gb.hw.model

import io.reactivex.rxjava3.core.Observable


interface UserRepository {
   fun getUsers(): Observable<List<User>>
   fun getUserByLogin(userLogin: String, userPass: String):  Observable<User>
}