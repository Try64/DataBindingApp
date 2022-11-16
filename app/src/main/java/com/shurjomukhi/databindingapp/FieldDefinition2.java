package com.shurjomukhi.databindingapp;



import android.view.View;

import java.util.Map;

/**
 * Define form field (FieldView) parameters and aesthetics to dynamically build UI/view.
 * TODO may need context
 */
public class FieldDefinition2 {
    /**
     * Field or input type.
     *
     * @see android.widget.TextView
     * @see android.widget.ImageView
     * @see android.widget.Button
     * @see android.widget.DatePicker
     */
    public View type;
    /**
     * id or name to refer this field anytime
     */
    public String name;
    /**
     * Label or hint to show for this field or input
     */
    public String label;
    /**
     * Field value or input data to save, store in remote or show fetched data
     */
    public String value;
    private boolean optional;
    /**
     * Dropdown items to show if needed
     */
    public Map<String, String> dropdown;

    public FieldValidation getValidation() {
        return validation;
    }

    public void setValidation(FieldValidation validation) {
        this.validation = validation;
    }

    public FieldStyleDef getStyles() {
        return styles;
    }

    public void setStyles(FieldStyleDef styles) {
        this.styles = styles;
    }

    /**
     * Placeholder text to show when input field is empty
     */
    String placeholder;
    /**
     * Provide hint message to user. usually show this when mouseover on that field
     */
    String hint;
    // TODO Define FieldDefinition class to define what kind of validation need to be run for this field.
    public FieldValidation validation;
    public FieldStyleDef styles;

    public boolean isOptional() {
        return optional;
    }

    /**
     * Placeholder text to show when input field is empty
     */

    public FieldDefinition2(View type, String label, String value) {
        this.type = type;
        this.label = label;
        this.value = value;
    }

    public FieldDefinition2(View type, String label, String value, boolean optional) {
        this.type = type;
        this.label = label;
        this.value = value;
        this.optional = optional;
    }


}

