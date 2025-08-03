package com.mj.composewithroom.ui.main.add

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import com.mj.composewithroom.base.BaseViewModel
import com.mj.composewithroom.data.AppDataManager
import com.mj.composewithroom.data.model.Vehicle
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AddVehicleViewModel @Inject constructor(override val appDataManager: AppDataManager) : BaseViewModel(appDataManager) {


    var brand by mutableStateOf("")
    var model by mutableStateOf("")
    var fuelType by mutableStateOf("")
    var vehicleNumber by mutableStateOf("")
    var year by mutableStateOf("")
    var ownerName by mutableStateOf("")


}