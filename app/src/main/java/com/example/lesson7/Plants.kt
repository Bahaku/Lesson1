package com.example.lesson7

import android.content.Context
import android.widget.Toast

abstract class Plants {
    abstract fun toGrow(context: Context)
    fun showToast(context: Context,texttoGrow:String){
        Toast.makeText(context, texttoGrow, Toast.LENGTH_SHORT).show()

    }


}