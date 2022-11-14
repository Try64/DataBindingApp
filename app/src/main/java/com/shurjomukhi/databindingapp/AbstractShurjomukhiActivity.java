package com.shurjomukhi.databindingapp;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import java.util.List;
import java.util.Map;

/**
 * Abstract activity to guide shurjomukhi apps.
 * -set layout (screen size,background etc)(DONE)
 * -screen/view definition(DONE)
 * -viewModel(data source/data binding)(SKIPPED)
 * -data submit action / update(DONE)
 * -next step(where to go next)(DONE)
 * -field /check validity(DONE)
 */
public class AbstractShurjomukhiActivity extends AppCompatActivity {
    /** page or activity title */
    protected String pageTitle;
    /** Controls which layout will be used. NOTE: sometimes devs call it binding */
    protected String layout;
    /** Fields to show in main container in this page layout */
    protected List<FieldDefinitionV0> fields;
    /** View generated in container based on field definiton, searchable by field name or id */
    protected Map<String, View> childViews;
    /** Top (main) container which will hold all the fields (field views) */
    protected LinearLayout container;
    /** Data model type or class name (TODO use generics) which will hold the form data values */
    protected Object dataModel;
    /** TRUE: view fields should be editable. FALSE: view fields values should be readonly */
    protected boolean isEditMode;
    /** Bind data from model into the fields received from repository or network response */
    // TODO idea is very much incomplete. need strong review
    protected ViewModelProvider viewModelBinder;
    /** Remember or know who called or launched this activity */
    protected String lastActivity;
    /** name of the activity class to launch next. TODO use appropriate type */
    protected String nextActivity;


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

}
