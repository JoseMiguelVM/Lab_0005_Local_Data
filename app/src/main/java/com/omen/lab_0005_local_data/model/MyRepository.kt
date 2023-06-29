package com.omen.lab_0005_local_data.model

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.omen.lab_0005_local_data.entities.SensorDataItem
import com.omen.lab_0005_local_data.paging.MyPagingSource
import kotlinx.coroutines.flow.Flow

class MyRepository(
    private val myDao: SensorDataItemDao
) {
    fun getData(): Flow<PagingData<SensorDataItem>> {
        return Pager(
            config = PagingConfig(pageSize = 10),
            pagingSourceFactory = { MyPagingSource(myDao) }
        ).flow
    }
}