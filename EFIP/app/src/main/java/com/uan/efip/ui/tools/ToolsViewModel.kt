package com.uan.efip.ui.tools

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ToolsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Pendiente"
    }
    val text: LiveData<String> = _text
}