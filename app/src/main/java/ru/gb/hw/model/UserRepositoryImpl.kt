package ru.gb.hw.model

class UserRepositoryImpl: UserRepository {

    private  lateinit var  user: User

    override fun getUser(): User {
        return user
    }

    override fun setUser(user: User){
        this.user = user
    }


}