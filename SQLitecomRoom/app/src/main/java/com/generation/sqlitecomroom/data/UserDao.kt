package com.generation.sqlitecomroom.data

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addUser(usuario: Usuario)

    @Query("SELECT * FROM user_table ORDER BY id ASC")
    fun selectUser(): LiveData<List<Usuario>>

    @Update
    fun updateUser(usuario: Usuario)

    @Delete
    fun deleteUser(usuario: Usuario)

}