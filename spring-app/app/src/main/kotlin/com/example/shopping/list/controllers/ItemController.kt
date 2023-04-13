package com.example.shopping.list.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
open class ItemController {

  @GetMapping("/items")
  fun getItems() = listOf("eggs", "milk")
}