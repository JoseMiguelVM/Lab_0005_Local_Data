package com.omen.lab_0005_local_data.model

import androidx.room.Database
import androidx.room.RoomDatabase
import com.omen.lab_0005_local_data.entities.SensorDataItem

@Database(entities = [SensorDataItem::class], version = 2)
abstract class AppDatabase : RoomDatabase() {
    abstract fun operationsSesnsorDataItemDao(): SensorDataItemDao
}