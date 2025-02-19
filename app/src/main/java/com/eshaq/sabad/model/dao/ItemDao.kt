package com.eshaq.sabad.model.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.eshaq.sabad.model.entity.Item

@Dao
interface ItemDao {
    @Query("Select * from tbl_Items")
    fun getAllItems():LiveData<List<Item>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun inssertItem(item: Item)

    @Update
    fun updateItem(item: Item)

    @Update
    fun buyFlagItem(item: Item)

    @Update
    fun buyAllItems()

    @Delete
    fun delete(item: Item)

    @Delete
    fun deleteAll()


}