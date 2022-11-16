package com.shurjomukhi.databindingapp;

/**
 * Input field validation parameters.
 */
public class FieldValidation {
    /** Minimum and maximum length allowed in the input field. No check if NULL */
    public Integer minLength, maxLength;
    /** Data format validation using regex; e.g. needed for phone, email format check */
    public String  regex;
    /** Minimum and/or maximum value allowed for integer type fields */
    public Integer minValue, maxValue;



    /** All type of definition as expected parameters
     * @param maxLength the maximum typing length of input
     * @param minLength the minimum typing length of input
     * */
    public FieldValidation(Integer minLength, Integer maxLength, String regex) {
        this.minLength = minLength;
        this.maxLength = maxLength;
        this.regex = regex;
    }


    /** All type of definition as expected parameters
     * @param minValue the minimum value of input
     * @param maxValue the maximum value of input
     * @param maxLength the maximum typing length of input
     * @param minLength the minimum typing length of input
     * @param regex for the input validation
     * */
    public FieldValidation(Integer minLength,
                           Integer maxLength,
                           String regex,
                           Integer minValue,
                           Integer maxValue) {
        this.minLength = minLength;
        this.maxLength = maxLength;
        this.regex = regex;
        this.minValue = minValue;
        this.maxValue = maxValue;
    }
}
