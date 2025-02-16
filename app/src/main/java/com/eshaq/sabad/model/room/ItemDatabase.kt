package com.eshaq.sabad.model.room;

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.eshaq.sabad.model.dao.ItemDao
import com.eshaq.sabad.model.entity.Item

@Database(entities =[Item::class], version = 1, exportSchema = false)
abstract class ItemDatabase : RoomDatabase() {
    //Dao interface for the database
    abstract  fun itemsDao(): ItemDao

    @Volatile
    var INSTANCE : ItemDatabase?=null
    // Singleton instance of the database
    fun getDatabaseInstance(context : Context):ItemDatabase {
        val tempInstance = INSTANCE
        if(tempInstance!=null) {
            return tempInstance
        }
    // Synchronized block to make sure that
    // only one instance of the database is created
    synchronized(this) {
        val roomDatabaseInstance = Room.databaseBuilder(context,ItemDatabase::class.java,"Items_db").allowMainThreadQueries().build()
        INSTANCE = roomDatabaseInstance
        return roomDatabaseInstance             }
    }
}
