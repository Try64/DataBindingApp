package com.shurjomukhi.databindingapp

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.gson.Gson

class ProposedActivity0 : BaseShurjomukhiActivity() {
    var obj:DataSourceObjectV0? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_proposed0)
        setActivityTitle()
        setFieldDefinitions()
        defineContainerViewSetFromFieldDef()


        /* getting data from Intent*/
        if(intent.hasExtra("DATA")){
            obj = intent.extras?.getParcelable("DATA")
        }
        /* Setting data to super class */
        setDataFromIntent()
        val list:List<String> = ArrayList<String>()
    }

    private fun defineContainerViewSetFromFieldDef() {
        for (it in this.fields) {
            when(it.itemViewType) {
                type instanceof TextView: gen
                FieldDefinition.ViewType.EditText
            }
        }
    }

    private fun setActivityTitle() {
        // TODO get title text if someone (intent) else sends a title
        this.title = "Blah lah title"
    }

    private fun setFieldDefinitions() {
        val field0 = FieldDefinitionV0(isAmountField = false,
            itemViewType = TextView::class.java,
            type = TextView.c,
            dropDownValues = null,
            placeholderInObject = "name",
            itemViewName = "Username",
            itemViewHint = "Username",
            itemValue = "Md. Abul Hasnat",
            isOptional = true,
            uniqueIdentifier = "user.name",
            url = "",
            onSelectionDropDown = {},
            validationCheck = { strUserName ->
                true
            })
        this.fields.add(field0);

        val field1 = FieldDefinitionV0(isAmountField = true,
            itemViewType = EditText::class.java,
            dropDownValues = null,
            placeholderInObject = null,
            itemViewName = "Monthly Income",
            itemViewHint = "Monthly Income",
            itemValue = "",
            isOptional = true,
            uniqueIdentifier = "",
            url = "",
            onSelectionDropDown = {},
            validationCheck = { url ->
                var flag = true
                if (Util.getNumeric(url).trim().length < 6) {
                    flag = false
                    Toast.makeText(
                        applicationContext,
                        "Length must be more then 6",
                        Toast.LENGTH_LONG
                    ).show()
                }
                flag
            })
        this.fields.add(field1);

        val field2 = FieldDefinitionV0(isAmountField = true,
            itemViewType = FieldDefinition.ViewType.DropDown.name,
            dropDownValues = arrayListOf("Dhaka", "Cumilla", "Feni", "Chadpur"),
            placeholderInObject = null,
            itemViewName = "District",
            itemViewHint = "District",
            itemValue = "Dhaka",
            isOptional = true,
            uniqueIdentifier = "",
            url = "",
            onSelectionDropDown = {},
            validationCheck = { url ->
                var flag = true
                if (url == "Choose") {
                    Toast.makeText(
                        applicationContext,
                        "Please select your district",
                        Toast.LENGTH_LONG
                    ).show()
                    flag = false
                }
                if (url == "Feni") {
                    Toast.makeText(applicationContext, "Feni is not allowed", Toast.LENGTH_LONG)
                        .show()
                    flag = false
                }
                flag

            })
        this.fields.add(field2);

        val field3 = FieldDefinitionV0(isAmountField = false,
            itemViewType = FieldDefinition.ViewType.Button.name,
            dropDownValues = null,
            placeholderInObject = null,
            itemViewName = "Go To Home",
            itemViewHint = "dismiss",
            itemValue = "",
            isOptional = true,
            uniqueIdentifier = "",
            url = "",
            onSelectionDropDown = {},
            validationCheck = { url ->
                false
            })
        this.fields.add(field3);
    }

    /* Setting data onto Super Class */
    private fun setDataFromIntent() {
        obj?.let { notNullObj ->
            notNullObj.pageTitle?.let {
                pageTitle = it
            }
            notNullObj.listOfViews?.let { notNullFieldList ->
                fields = notNullFieldList
            }

        }
    }
}