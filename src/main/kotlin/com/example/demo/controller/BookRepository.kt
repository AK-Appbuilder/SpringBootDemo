package com.example.demo.controller

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import java.time.LocalDate

interface BookRepository : JpaRepository<Book, Long> {

    fun findByTitle(title: String) : Book

    @Query("SELECT b FROM Book b WHERE b.publishDate > :date")
    fun findByPublishDateAfter(@Param("date") date: LocalDate)
}