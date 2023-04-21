package com.example.shoppinglist.entities

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table


@Entity
@Table(name = "shopping_items")
class ShoppingItem(
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY) // to avoid needing a sequence in MySQL
  var id: Long? = null,
  var name: String
) {
  constructor(name: String) : this(null, name)
  constructor() : this(null, "") // for JPA
}