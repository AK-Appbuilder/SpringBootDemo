package com.example.demo.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController


@RestController
class BookController {

    @Autowired
    lateinit var bookService: BookService

    @PostMapping("/add")
    fun addBook() {
        bookService.addBooks()
    }

    @GetMapping("/findall")
    fun getAllBooks(): List<Book> {
        return bookService.findAll()
    }

    @GetMapping("findbytitle/{title}")
    fun findByTitle(@PathVariable title: String) : Book {
        return bookService.findByTitle(title)
    }

    @PostMapping("addbook")
    fun addBook(@RequestBody book: Book): String {
        bookService.save(book)
        return "book add successfully"
    }

    @DeleteMapping("/delete")
    fun delete() {
        bookService.deleteAllData()
    }
}