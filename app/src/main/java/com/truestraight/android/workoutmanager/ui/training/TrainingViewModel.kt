package com.truestraight.android.workoutmanager.ui.training

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TrainingViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Group Fragment"
    }
    val text: LiveData<String> = _text
}