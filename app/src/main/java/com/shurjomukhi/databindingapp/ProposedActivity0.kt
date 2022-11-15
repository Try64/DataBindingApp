package com.shurjomukhi.databindingapp

import android.os.Bundle
import com.google.gson.Gson

class ProposedActivity0 : BaseShurjomukhiActivity() {
    var obj:DataSourceObjectV0? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_proposed0)

        if(intent.hasExtra("DATA")){
            obj = intent.extras?.getParcelable("DATA")
        }

        setDataFromIntent()


    }

    private fun setDataFromIntent() {
        obj?.let { notNullObj ->
            notNullObj.pageTitle?.let {
                pageTitle = it
            }
            notNullObj.listOfViews?.let { notNullFieldList ->
                fields = notNullFieldList
            }

        }
    }
}