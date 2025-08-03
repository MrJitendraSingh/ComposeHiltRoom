package com.mj.composewithroom.base

import android.widget.Toast
import androidx.lifecycle.ViewModel
import com.mj.composewithroom.data.AppDataManager

abstract class BaseViewModel(open val appDataManager: AppDataManager) : ViewModel() {


    fun showToast(message: String){
        Toast.makeText(appDataManager.context, message, Toast.LENGTH_SHORT).show()
    }

}