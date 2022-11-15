package com.shurjomukhi.databindingapp

import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import kotlin.properties.Delegates

/**
 * Abstract activity to guide shurjomukhi apps.
 * -set layout (screen size,background etc)(DONE) // BackArrow, Home Button Up
 * -screen/view definition(DONE)
 * -viewModel(data source/data binding)(SKIPPED)
 * -data submit action / update(DONE)
 * -next step(where to go next)(DONE)
 * -field /check validity(DONE)
 */
open class BaseShurjomukhiActivity: AppCompatActivity() {
    /** page or activity title */
    protected lateinit var pageTitle:String
    /** Fields to show in main container in this page layout */
    protected lateinit var fields:List<FieldDefinitionV0>
    /** View generated in container based on field definiton, searchable by field name or id */
    protected lateinit var childViews:Map<String, View>
    /** Top (main) container which will hold all the fields (field views) */
    protected lateinit var viewContainer:LinearLayout

    /** Data model type or class name (TODO use generics) which will hold the form data values  */
    protected  var dataModel:Class<*>? = null

    /** TRUE: view fields should be editable. FALSE: view fields values should be readonly  */
    protected var isEdit by Delegates.notNull<Boolean>()

//    /** Bind data from model into the fields received from repository or network response  */ // TODO idea is very much incomplete. need strong review
//    protected var viewModelBinder: ViewModelProvider? = null

    /** Remember or know who called or launched this activity  */
    protected var lastActivity: Class<*>? = null

    /** name of the activity class to launch next. TODO use appropriate type  */
    protected var nextActivity: Class<*>? = null




}