package com.eshaq.sabad.model.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tbl_Items")
class Item {
    @PrimaryKey(autoGenerate = true)
     var id:Int = 0
    lateinit var name:String
    lateinit var amount:String
    lateinit var unit:String
    var isBought:Boolean=false
}