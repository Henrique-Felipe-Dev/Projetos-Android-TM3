package com.generation.sqlitecomroom.data

class UserRepository (private val userDao: UserDao) {

    val selectedUser = userDao.selectUser()

    fun addUser(usuario: Usuario){
        userDao.addUser(usuario)
    }

}