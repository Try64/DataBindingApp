package com.shurjomukhi.databindingapp

import android.os.Parcel
import android.os.Parcelable


data class ItemViewDefinition(
    var itemViewType:String?,
//    var dataStoreClass: Class<*>? = null,
    var placeholderInObject:String?,
    var itemViewName:String?,
    var itemViewHint:String?,
    var isOptional:Boolean,
    var uniqueIdentifier:String?
) : Parcelable {


    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readByte() != 0.toByte(),
        parcel.readString()
    ) {
    }

    enum class ViewType(code:Int){
        TextView(0),
        EditText(1),
        DropDown(2),
        ImageView(3),
        Button(4)
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(itemViewType)
        parcel.writeString(placeholderInObject)
        parcel.writeString(itemViewName)
        parcel.writeString(itemViewHint)
        parcel.writeByte(if (isOptional) 1 else 0)
        parcel.writeString(uniqueIdentifier)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<ItemViewDefinition> {
        override fun createFromParcel(parcel: Parcel): ItemViewDefinition {
            return ItemViewDefinition(parcel)
        }

        override fun newArray(size: Int): Array<ItemViewDefinition?> {
            return arrayOfNulls(size)
        }
    }
}