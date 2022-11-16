package com.shurjomukhi.databindingapp

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import com.google.gson.Gson

class ProposedActivity0 : BaseShurjomukhiActivity() {
    var obj:DataSourceObjectV0? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_proposed0)
        childViews = HashMap<String,View>()
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
        for (viewItem in this.fields) {
            when(viewItem.itemViewType) {
                TextView::class.java -> {

                }
                EditText::class.java -> {
                    val view = LayoutInflater.from(this).inflate(R.layout.edit_text_material,null)
                    view?.let{
                        val til = view.findViewById<TextInputLayout>(R.id.tiLayout)
                        val et = view.findViewById<TextInputEditText>(R.id.editText)
                        til.hint = viewItem.itemViewHint
                        til.tag = viewItem.itemViewHint
                        et.setText(viewItem.itemValue)
                        til.apply {
                            if(parent != null){
                                (parent as ViewGroup).removeView(this)
                            }
                        }
                        viewItem.isAmountField?.let { isAmount->
                            if(isAmount){
                                var isEdting = false
                                et.addTextChangedListener(object : TextWatcher {
                                    override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                                        Log.d("Logg","beforeTextChanged ->"+p0.toString())
                                    }

                                    override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                                        Log.d("Logg","onTextChanged ->"+p0.toString())
                                    }

                                    override fun afterTextChanged(p0: Editable?) {
                                        if(!isEdting){
                                            isEdting = true
                                            et.setText(Util.getMoneyFormat(Util.getNumeric(p0.toString())))
                                            et.setSelection(et.text.toString().length)
                                            Log.d("Logg","afterTextChanged ->"+p0.toString())
                                            isEdting = false
                                        }
                                    }
                                })
                            }

                        }
                        //Add view to child view
                        viewObjArray.add(til)
                        container.addView(til)
                    }
                }
                Button::class.java -> {

                }
                AutoCompleteTextView::class.java -> {

                }
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
            itemViewType = AutoCompleteTextView::class.java,
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
            itemViewType = Button::class.java,
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