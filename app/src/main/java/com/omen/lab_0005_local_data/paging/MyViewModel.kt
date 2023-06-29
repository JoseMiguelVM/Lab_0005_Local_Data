package com.omen.lab_0005_local_data.paging

import androidx.lifecycle.ViewModel
import androidx.paging.PagingData
import com.omen.lab_0005_local_data.entities.SensorDataItem
import com.omen.lab_0005_local_data.model.MyRepository
import com.omen.lab_0005_local_data.model.SensorDataItemDao
import kotlinx.coroutines.flow.Flow

class MyViewModel(
    private val myDao: SensorDataItemDao //estos parametros son del constructor
) : ViewModel() {

    private val repository = MyRepository(myDao)

    fun getData(): Flow<PagingData<SensorDataItem>> {
        return repository.getData()
    }
}