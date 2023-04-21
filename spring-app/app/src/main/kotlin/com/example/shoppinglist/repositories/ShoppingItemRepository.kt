package com.example.shoppinglist.repositories

import com.example.shoppinglist.entities.ShoppingItem
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ShoppingItemRepository : JpaRepository<ShoppingItem, Long> {
}