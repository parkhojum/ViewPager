package com.example.viewpager

import androidx.appcompat.app.AppCompatActivity

abstract class BaesActivity : AppCompatActivity() {

    val mContext = this
    abstract fun setupEvents()
    abstract fun setValues()

}