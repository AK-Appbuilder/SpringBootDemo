package com.example.demo.controller

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.math.BigDecimal
import java.time.LocalDate


@Entity
class Book(
    val title: String,
    val price: BigDecimal,
    val publishDate: LocalDate,
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long?= null,
)