package com.slepnev.shoppinglist.database

import android.content.Context
import com.slepnev.shoppinglist.model.Product

class ProductRepository(context: Context) {
    private val productDao: ProductDao

    init {
        val database =
            ShoppingListRoomDatabase.getDatabase(context)
        productDao = database!!.productDao()
        }
        suspend fun getAllProducts(): List<Product> {
            return productDao.getAllProducts()
        }

        suspend fun insertProduct(product: Product) {
            return productDao.insertProduct(product)
        }

        suspend fun deleteProduct(product: Product) {
            return productDao.deleteProduct(product)
        }

        suspend fun deleteAllProducts() {
            return productDao.deleteAllProducts()
        }
}