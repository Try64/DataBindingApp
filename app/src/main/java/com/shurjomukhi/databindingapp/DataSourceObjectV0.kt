package com.shurjomukhi.databindingapp

/**
 *  Primary object to pass to another page
 */
data class DataSourceObjectV0(
    /** Field definition to generate the view */
    var listOfViews: ArrayList<FieldDefinitionV0>?,
    /** Destination Activity which will launched by current activity */
    val destinationActivity:Class<*>?,
    /** Mode in which the activity should work like */
    var isModeEdit:Boolean?,
    /** Mode in which the activity should work like */
    val isModeView:Boolean?,
    /** Should use backend network call or not */
    val submitOnline:Boolean?,
    /** API endpoint on which we should submit data */
    val endPoint:String?,
    /** The POJO class used to submit data to backend */
    val dataModel:Class<*>?, // TODO: Data model would be identified to the page who will use it.
    /** Title for the page */
    val pageTitle:String?,
    /** Functionality for BackPress */
    var onBackPressed:() -> Unit
)
