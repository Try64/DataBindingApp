package com.shurjomukhi.databindingapp

/**
 *  Primary object to pass
 */
data class DataSourceObjectV0(
    var listOfViews: ArrayList<FieldDefinitionV0>?,
    val goToNextClass:Class<*>?,
    var isModeEdit:Boolean?,
    val isModeView:Boolean?,
    val submitOnline:Boolean?,
    val endPoint:String?,
    val dataModel:Class<*>?,
    val pageTitle:String?,
    var onBackPressed:() -> Unit
)
