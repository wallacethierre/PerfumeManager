package com.djaca.android.perfumemanager.framework.dataBase

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.djaca.android.perfumemanager.core.data.Perfume

@Entity(tableName = "perfume")
data class PerfumeEntity(
    val name: String,
    val brand: String,
    var imageURL: String,
    var timeOFDay: String,
    var seasson: String,

    @PrimaryKey(autoGenerate = true)
    val id: Long = 0
) {
    companion object {
        fun fromPerfume(perfume: Perfume) = PerfumeEntity(perfume.name, perfume.brand,
            perfume.imageURL, perfume.timeOFDay.name, perfume.seasson.name)

//        fun toPerfume() = Perfume(id, name, brand, imageURL,timeOFDay, seasson)
    }
}

//ar name: String,
//var brand: String,
//var imageURL: String,
//var timeOFDay: TimeOFDay,
//var seasson: Seasson