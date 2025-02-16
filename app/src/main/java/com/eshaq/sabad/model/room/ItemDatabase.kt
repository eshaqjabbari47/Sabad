package com.eshaq.sabad.model.room;

import androidx.room.Database
import androidx.room.RoomDatabase
import com.eshaq.sabad.model.entity.Item

@Database(entities =[Item::class], version = 1, exportSchema = false)
abstract class ItemDatabase : RoomDatabase() {
    
}
