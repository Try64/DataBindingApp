package com.shurjomukhi.databindingapp

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue

/**
 *  Primary object to pass to another page
 */
@Parcelize
data class DataSourceObjectV0(
    @SerializedName("listOfViews")
    /** Field definition to generate the view */
    var listOfViews: ArrayList<FieldDefinitionV0>?,
    /** Destination Activity which will launched by current activity */
    @SerializedName("destinationActivity")
    val destinationActivity:Class<*>?,
    /** Mode in which the activity should work like */
    @SerializedName("isModeEdit")
    var isModeEdit:Boolean?,
    /** Mode in which the activity should work like */
    @SerializedName("isModeView")
    val isModeView:Boolean?,
    /** Should use backend network call or not */
    @SerializedName("submitOnline")
    val submitOnline:Boolean?,
    /** API endpoint on which we should submit data */
    @SerializedName("endPoint")
    val endPoint:String?,
    /** The POJO class used to submit data to backend */
    @SerializedName("dataModel")
    val dataModel:Class<*>?, // TODO: Data model would be identified to the page who will use it.
    /** Title for the page */
    @SerializedName("pageTitle")
    val pageTitle:String?,
    /** Functionality for BackPress */

    var onBackPressed:() -> Unit
) : Parcelable{
    fun onClick() = onBackPressed()
}
