package com.example.counter.view

import android.content.Context
import android.view.View

interface CounterView {
    fun changeCount(count:Int)
    fun showToast(text:String)
    fun changeTextColor(color:Int)
}