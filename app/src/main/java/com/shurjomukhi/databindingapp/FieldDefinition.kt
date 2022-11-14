package com.shurjomukhi.databindingapp

import android.os.Parcel
import android.os.Parcelable


data class FieldDefinition(

    /**
     * Type of field ie. TextInput, ImageView...
     * @see android.widget.TextView
     * @see android.widget.ImageView
     * @see android.widget.Button
     */
    var itemViewType:String?,

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

    // TODO the code numbers are useless. Only the name matters
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

    companion object CREATOR : Parcelable.Creator<FieldDefinition> {
        override fun createFromParcel(parcel: Parcel): FieldDefinition {
            return FieldDefinition(parcel)
        }

        override fun newArray(size: Int): Array<FieldDefinition?> {
            return arrayOfNulls(size)
        }
    }
}