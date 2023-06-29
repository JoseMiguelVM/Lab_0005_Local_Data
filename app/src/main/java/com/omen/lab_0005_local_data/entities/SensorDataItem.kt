package com.omen.lab_0005_local_data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "sensordataitem")
data class SensorDataItem(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val fecha: String,
    val humedad: String,
    val comentario: String
)