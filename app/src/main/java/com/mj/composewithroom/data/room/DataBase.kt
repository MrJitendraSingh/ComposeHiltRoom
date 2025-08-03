package com.mj.composewithroom.data.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.mj.composewithroom.data.room.dao.VehicleDao
import com.mj.composewithroom.data.room.entity.VehicleEntity

@Database(entities = [VehicleEntity::class], version = 1, exportSchema = false)
abstract class DataBase : RoomDatabase() {
    abstract fun getVehicleDao(): VehicleDao
}