package com.example.demo.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.math.BigDecimal
import java.time.LocalDate
import java.util.*


@Service
class BookService {

    @Autowired
     lateinit var bookRepository: BookRepository


     fun addBooks(){
         val b1 = Book("Book A", BigDecimal.valueOf(9.99), LocalDate.of(2023, 8, 31))
         val b2 = Book("Book B", BigDecimal.valueOf(19.99), LocalDate.of(2023, 7, 31))
         val b3 = Book("Book C", BigDecimal.valueOf(29.99), LocalDate.of(2023, 6, 10))
         val b4 = Book("Book D", BigDecimal.valueOf(39.99), LocalDate.of(2023, 5, 5))


         // save a few books, ID auto increase, expect 1, 2, 3, 4
         bookRepository.save(b1)
         bookRepository.save(b2)
         bookRepository.save(b3)
         bookRepository.save(b4)
     }

    fun findAll(): List<Book> {
        return bookRepository.findAll()
    }

    fun findByTitle(title: String): Book {
        return bookRepository.findByTitle(title)
    }

    fun save(book: Book): Book {
        return bookRepository.save(book)
    }

    fun deleteAllData() {
        bookRepository.deleteAll()
    }


}