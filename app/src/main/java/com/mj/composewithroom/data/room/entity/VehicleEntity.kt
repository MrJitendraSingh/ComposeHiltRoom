package com.mj.composewithroom.data.room.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "vehicle")
data class VehicleEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long? = null,
    val brand: String,
    val model: String,
    val fuelType: String,
    val vehicleNumber: String,
    val year: Int,
    val ownerName: String
)