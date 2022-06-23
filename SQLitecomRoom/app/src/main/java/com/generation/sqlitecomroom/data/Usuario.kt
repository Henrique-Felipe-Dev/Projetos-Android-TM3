package com.generation.sqlitecomroom.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_table")
data class Usuario (
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val nome: String,
    val sobrenome: String,
    val idade: Int
        ) {
}