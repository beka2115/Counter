package com.example.counter

import android.content.Context
import android.widget.Toast

fun Context.showToasts(msg: String) {
    Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
}