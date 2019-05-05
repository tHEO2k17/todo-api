package com.todo.api.controller

import com.todo.api.model.TodoDao
import com.todo.api.repository.ITodoRepository
import org.springframework.web.bind.annotation.*
import org.springframework.web.servlet.config.annotation.EnableWebMvc

@RestController
@RequestMapping("/api/todos")
@EnableWebMvc
class TodoController(private val todoRepository: ITodoRepository) {

    @GetMapping("/")
    fun getAll() = todoRepository.findAll()

    @GetMapping("/{id}")
    fun getById(@PathVariable id: Long) = todoRepository.findById(id)

    @PostMapping("/")
    fun addNew(@RequestBody todoDao: TodoDao) = todoRepository
            .save(
                    TodoDao(
                            taskName = todoDao.taskName,
                            taskDescription = todoDao.taskDescription,
                            completed = todoDao.completed
                    )
            )

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long) = todoRepository.deleteById(id)
}