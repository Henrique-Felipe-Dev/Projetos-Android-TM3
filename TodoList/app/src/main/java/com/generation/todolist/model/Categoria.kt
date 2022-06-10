package com.generation.todolist.model

data class Categoria (
    val id: Long,
    val descricao: String?,
    val tarefas: List<Tarefa>?
        ) {
}