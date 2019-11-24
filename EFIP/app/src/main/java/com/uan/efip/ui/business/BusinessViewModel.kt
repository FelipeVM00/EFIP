package com.uan.efip.ui.business

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BusinessViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Pendiente"
    }
    val text: LiveData<String> = _text
}