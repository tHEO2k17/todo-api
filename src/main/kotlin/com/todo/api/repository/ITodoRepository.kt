package com.todo.api.repository

import com.todo.api.model.TodoDao
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface ITodoRepository : JpaRepository<TodoDao, Long>