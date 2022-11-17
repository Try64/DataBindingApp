package com.shurjomukhi.databindingapp

import android.view.View


/**
 * Define form field (FieldView) parameters and aesthetics to dynamically build UI/view.
 * TODO may need context
 */
class FieldDefinition2 {
    /**
     * Field or input type.
     *
     * @see android.widget.TextView
     *
     * @see android.widget.ImageView
     *
     * @see android.widget.Button
     *
     * @see android.widget.DatePicker
     */
    var type: View

    /**
     * id or name to refer this field anytime
     */
    var name: String? = null

    /**
     * Label or hint to show for this field or input
     */
    var label: String

    /**
     * Field value or input data to save, store in remote or show fetched data
     */
    var value: String
    var isOptional = false
        private set

    /**
     * Dropdown items to show if needed
     */
    var dropdown: Map<String, String>? = null

    /**
     * Placeholder text to show when input field is empty
     */
    var placeholder: String? = null

    /**
     * Provide hint message to user. usually show this when mouseover on that field
     */
    var hint: String? = null

    // TODO Define FieldDefinition class to define what kind of validation need to be run for this field.
    var validation: FieldValidation? = null
    var styles: FieldStyleDef? = null

    /**
     * Placeholder text to show when input field is empty
     */
    constructor(type: View, label: String, value: String) {
        this.type = type
        this.label = label
        this.value = value
    }

    /**
     * Check field is optional or not
     */
    constructor(type: View, label: String, value: String, optional: Boolean) {
        this.type = type
        this.label = label
        this.value = value
        isOptional = optional
    }
}

