package com.shurjomukhi.databindingapp

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize


@Parcelize
data class FieldDefinitionV0(
    @SerializedName("itemViewType")
    var itemViewType:String?,
    @SerializedName("placeholderInObject")
    var placeholderInObject:String?,
    @SerializedName("itemViewName")
    var itemViewName:String?,
    @SerializedName("itemViewHint")
    var itemViewHint:String?,
    @SerializedName("itemValue")
    var itemValue:String?,
    @SerializedName("isOptional")
    var isOptional:Boolean?,
    @SerializedName("uniqueIdentifier")
    var uniqueIdentifier:String?,
    @SerializedName("isAmountField")
    val isAmountField:Boolean?,
    @SerializedName("url")
    val url:String?,
    @SerializedName("dropDownValues")
    val dropDownValues:ArrayList<String>?,
    val onSelectionDropDown:(String) -> Unit,
    val validationCheck: (String) -> Boolean
) : Parcelable{

    fun onSelectDropDown(value : String) = onSelectionDropDown(value)
    fun onValidationCheck(value : String) = validationCheck(value)
}
