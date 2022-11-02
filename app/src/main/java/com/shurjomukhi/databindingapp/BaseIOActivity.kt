package com.shurjomukhi.databindingapp


import androidx.appcompat.app.AppCompatActivity

open class BaseIOActivity : AppCompatActivity() {

    private lateinit var views:MutableList<ItemViewDefinition>

    fun setViews(views:MutableList<ItemViewDefinition>){
        this@BaseIOActivity.views = views
    }
}