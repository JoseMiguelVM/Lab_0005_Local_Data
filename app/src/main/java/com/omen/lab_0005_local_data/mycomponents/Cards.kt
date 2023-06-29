package com.omen.lab_0005_local_data.mycomponents

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.room.Database
import androidx.room.RoomDatabase
import com.omen.lab_0005_local_data.entities.SensorDataItem
import com.omen.lab_0005_local_data.model.SensorDataItemDao


@Composable
fun SensorDataItemCard(
    sensorDataItem: SensorDataItem
){

    Card(
        modifier = Modifier
            .padding(8.dp)
            .clickable { }
            .fillMaxWidth(),
        elevation = 10.dp,
        shape = RoundedCornerShape(8.dp)
    ) {
        Column(
            modifier = Modifier.background(Color.LightGray)
                .fillMaxSize()
                .padding(10.dp)
        ) {
            Text(text = "Fecha: " + sensorDataItem.fecha)
            Text(text = "Medicion de humedad: " + sensorDataItem.humedad)
            Text(text = "Comentario: " + sensorDataItem.comentario)
        }

    }

}