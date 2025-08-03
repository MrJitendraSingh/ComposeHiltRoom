package com.mj.composewithroom.data

import android.content.Context
import com.mj.composewithroom.data.pref.AppPreferences
import javax.inject.Inject

class AppDataManager @Inject constructor(val context: Context) : AppPreferences(context) {

}