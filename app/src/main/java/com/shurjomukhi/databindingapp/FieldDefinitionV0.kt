package com.shurjomukhi.databindingapp

data class FieldDefinitionV0(
    var itemViewType:String?,
    var placeholderInObject:String?,
    var itemViewName:String?,
    var itemViewHint:String?,
    var itemValue:String?,
    var isOptional:Boolean?,
    var uniqueIdentifier:String?,
    val isAmountField:Boolean?,
    val url:String?,
    val dropDownValues:ArrayList<String>?,
    val onSelectionDropDown:(String) -> Unit,
    val validationCheck: (String) -> Boolean
)
