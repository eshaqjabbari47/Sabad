package com.eshaq.sabad.model.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import com.eshaq.sabad.model.entity.Item

@Dao
interface ItemDao {
    @Query("Select * from tbl_Items")
    fun getAllItems():LiveData<List<Item>>
}