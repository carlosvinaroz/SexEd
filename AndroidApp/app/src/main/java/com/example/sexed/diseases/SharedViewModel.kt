package com.example.sexed.diseases

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {
    private val _selectedButton = MutableLiveData<String>()
    val selectedButton: LiveData<String> get() = _selectedButton

    fun setSelectedButton(buttonName: String) {
        _selectedButton.value = buttonName
    }
}
