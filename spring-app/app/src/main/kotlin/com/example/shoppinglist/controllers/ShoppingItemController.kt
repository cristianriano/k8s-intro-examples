package com.example.shoppinglist.controllers

import com.example.shoppinglist.entities.ShoppingItem
import com.example.shoppinglist.repositories.ShoppingItemRepository
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
open class ShoppingItemController(
  private val repo: ShoppingItemRepository
) {

  @GetMapping("/items")
  fun getItems() = repo.findAll().map { it.name }

  @PostMapping("/items")
  fun postItem(@RequestBody itemName: String): ResponseEntity<String> {
    repo.save(ShoppingItem(itemName))
    return ResponseEntity.status(201).build()
  }
}