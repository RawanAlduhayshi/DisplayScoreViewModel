package com.example.viewmodel

import androidx.lifecycle.ViewModel

class TestViewModel : ViewModel() {
    private var _num = 0
    var num = _num

    fun incrementFourPoints(){
       num= num+4
    }

    fun incrementOnePoints(){
       num= num+1

    }

    fun subtractPoints(){
       num= num-2

    }



}