package com.todo.api.model

import java.time.Instant
import javax.persistence.*
import javax.validation.constraints.NotBlank

@Entity
@Table(name ="todo")
data class TodoDao(
        @Id
        @Column(name ="id")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val Id: Long = 0,


        @Column(name ="task_name")
        var taskName: String = "",


        @Column(name ="task_description")
        var taskDescription: String = "",


        @Column(name ="created_at")
        val createdAt: Instant = Instant.now(),

        @Column(name ="completed")
        var completed: Boolean = false
)