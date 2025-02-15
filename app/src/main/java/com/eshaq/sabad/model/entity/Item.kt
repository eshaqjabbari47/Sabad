package com.eshaq.sabad.model.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tbl_Items")
class Item {
    @PrimaryKey(autoGenerate = true)
    var id:Int?=null
}