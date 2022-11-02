package com.shurjomukhi.databindingapp


import androidx.appcompat.app.AppCompatActivity

open class BaseIOActivity : AppCompatActivity() {

    private lateinit var views:MutableList<FieldDefinition>

    fun setViews(views:MutableList<FieldDefinition>){
        this@BaseIOActivity.views = views
    }
}