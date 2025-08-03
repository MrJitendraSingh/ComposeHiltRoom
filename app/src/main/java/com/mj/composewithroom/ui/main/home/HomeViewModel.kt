package com.mj.composewithroom.ui.main.home

import com.mj.composewithroom.base.BaseViewModel
import com.mj.composewithroom.data.AppDataManager
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(override val appDataManager: AppDataManager) : BaseViewModel(appDataManager) {


}