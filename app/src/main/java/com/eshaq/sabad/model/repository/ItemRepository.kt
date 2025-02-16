package com.eshaq.sabad.model.repository

import androidx.lifecycle.LiveData
import com.eshaq.sabad.model.dao.ItemDao
import com.eshaq.sabad.model.entity.Item

class ItemRepository(val dao: ItemDao) {
    // function to get all items from the database
    fun getAllItems() : LiveData<List<Item>> {
        return dao.getAllItems()
    }

    // function to insert a item in the database
    fun insertItem(item: Item) {
        dao.inssertItem(item)
    }

    //function to update a item in the database
    fun updateItem(item: Item) {
        dao.updateItem(item)
    }

    // function to buy a item in the database
    fun buyFlagItem(item: Item) {
        dao.buyFlagItem(item)
    }

    //function to buy all items in the database
    fun buyAllItems() {
        dao.buyAllItems()
    }

    // function to delete a item from the database
    fun deleteItem(item: Item) {
        dao.delete(item)
    }

    //function to delete all items from the database
    fun deleteAll() {
        dao.deleteAll()
    }

}
