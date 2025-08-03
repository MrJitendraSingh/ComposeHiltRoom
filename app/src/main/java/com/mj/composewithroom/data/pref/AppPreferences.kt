package com.mj.composewithroom.data.pref

import android.content.Context
import android.content.SharedPreferences
import javax.inject.Inject
import androidx.core.content.edit
import com.mj.composewithroom.utility.Const

open class AppPreferences @Inject constructor(context: Context){

    private val sharedPreferences: SharedPreferences = context.getSharedPreferences(Const.MY_PREF_NAME, Context.MODE_PRIVATE)

    fun setString(key: String, value: String) {
        sharedPreferences.edit { putString(key, value) }
    }

    fun getString(key: String, defaultValue: String = ""): String? {
        return sharedPreferences.getString(key, defaultValue)
    }

    fun setInt(key: String, value: Int) {
        sharedPreferences.edit { putInt(key, value) }
    }

    fun getInt(key: String, defaultValue: Int = 0): Int {
        return sharedPreferences.getInt(key, defaultValue)
    }


    fun setBoolean(key: String, value: Boolean) {
        sharedPreferences.edit { putBoolean(key, value) }
    }

    fun getBoolean(key: String, defaultValue: Boolean = false): Boolean {
        return sharedPreferences.getBoolean(key, defaultValue)
    }

    fun clearPref() {
        sharedPreferences.edit {
            clear()
        }
    }

}