package com.shurjomukhi.databindingapp;

/**
 * Input field style definition.
 */
public class FieldStyleDef {
    /** height and width allowed in the input field. No check if NULL */
    public int height, width;
    /** padding and margin allowed in the input field. No check if NULL */
    public int padding, margin;
    /** padding and margin allowed in the input field. No check if NULL */
    public String orientation;

    /**
     * This method can define the orientation with the padding and margin of a layout
     * @param height is defining height
     * @param width is defining width
     * @param orientation is defining orientation
     * No check if NULL */

    public FieldStyleDef(int height, int width, int padding, int margin, String orientation) {
        this.height = height;
        this.width = width;
        this.padding = padding;
        this.margin = margin;
        this.orientation = orientation;
    }


    /**
     * This method can define the orientation of a layout
     * @param height is defining height
     * @param width is defining width
     * @param orientation is defining orientation
     * No check if NULL */

    public FieldStyleDef(int height, int width, String orientation) {
        this.height = height;
        this.width = width;
        this.orientation = orientation;
    }

    /**
     * This method can define all side same margin of a layout
     * @param height is defining height
     * @param width is defining width
     * @param margin is defining total margin of a layout
     * No check if NULL */

    public FieldStyleDef(int height, int width, int margin) {
        this.height = height;
        this.width = width;
        this.margin = margin;
    }




}
