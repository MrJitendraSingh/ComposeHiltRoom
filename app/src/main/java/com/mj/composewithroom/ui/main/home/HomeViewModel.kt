package com.mj.composewithroom.ui.main.home

import com.mj.composewithroom.base.BaseViewModel
import com.mj.composewithroom.data.AppDataManager
import com.mj.composewithroom.data.model.Vehicle
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(override val appDataManager: AppDataManager) : BaseViewModel(appDataManager) {

    val sampleVehicles = listOf(
        Vehicle("Activa 4G", "Honda", "KA 01 AA 0007", "Petrol", "2018", "7 years 6 months"),
        Vehicle("Nexon XM", "Tata", "KA 10 AM 2323", "Petrol", "2021", "4 years 1 month"),
        Vehicle("Activa 125", "Honda", "DL 8 CAF 9876", "Petrol", "2020", "5 years 4 months"),
        Vehicle("City VX", "Honda", "TN 22 CZ 3344", "Petrol", "2022", "3 years 2 months"),
        Vehicle("Pulsar 150", "Bajaj", "UP 32 KT 1098", "Petrol", "2017", "7 years 7 months"),
        Vehicle("Pulsar 150", "Bajaj", "UP 32 KT 1098", "Petrol", "2017", "7 years 7 months"),
        Vehicle("Pulsar 150", "Bajaj", "UP 32 KT 1098", "Petrol", "2017", "7 years 7 months"),
        Vehicle("Pulsar 150", "Bajaj", "UP 32 KT 1098", "Petrol", "2017", "7 years 7 months"),
        Vehicle("Pulsar 150", "Bajaj", "UP 32 KT 1098", "Petrol", "2017", "7 years 7 months"),
        Vehicle("Pulsar 150", "Bajaj", "UP 32 KT 1098", "Petrol", "2017", "7 years 7 months"),
        Vehicle("Pulsar 150", "Bajaj", "UP 32 KT 1098", "Petrol", "2017", "7 years 7 months"),
    )


}