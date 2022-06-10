package com.generation.viewmodelelivedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var cont = MutableLiveData(0)

    fun addCont(){
        cont.value = cont.value?.plus(1)
    }
}