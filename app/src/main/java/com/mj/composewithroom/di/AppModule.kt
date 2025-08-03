package com.mj.composewithroom.di

import android.app.Application
import android.content.Context
import androidx.room.Room
import com.mj.composewithroom.data.pref.AppPreferences
import com.mj.composewithroom.data.room.DataBase
import com.mj.composewithroom.data.room.dao.VehicleDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object AppModule {

    @Singleton
    @Provides
    internal fun bindContext(application: Application) : Context = application

    @Singleton
    @Provides
    internal fun providePreferenceSource(context: Context): AppPreferences = AppPreferences(context)

    @Singleton
    @Provides
    internal fun provideRoomDatabase(application: Application): DataBase =
        Room.databaseBuilder(
            application,
            DataBase::class.java,
            "table"
        ).fallbackToDestructiveMigration().build()



    @Singleton
    @Provides
    internal fun provideVehicleDao(dataBase: DataBase): VehicleDao = dataBase.getVehicleDao()


}