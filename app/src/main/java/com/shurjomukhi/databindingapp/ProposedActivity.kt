package com.shurjomukhi.databindingapp


import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import coil.load
import com.google.android.material.imageview.ShapeableImageView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout


class ProposedActivity : BaseIOActivity() {

    private lateinit var _object:DataSourceObjectV0
    private var viewObjArray:ArrayList<View> = ArrayList()
    private lateinit var container:LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_proposed)

        /** View Container in which views will be generated */
        container = findViewById(R.id.holderLayout)

        /** Object Received from Previous page */
        _object = Util.ObjectV0!!

        /** Setting up page Title from Previous page*/
        title = _object.pageTitle


        /** Rest of the View Generation from View Definition */
        viewSetupV0()

    }



    private fun viewSetupV0(){

        /** ViewGroup Or Screen */
        viewObjArray.clear()

        /** Check for View mode / edit mode */
        _object.isModeEdit?.let { isEdit ->
            if(isEdit){

                // =========EDIT BLOCK========= //
                _object.listOfViews?.let { notNullViewList ->
                    /** Not Empty ViewDefinition List */
                    notNullViewList.forEach { viewItem->

                        /** Every ViewDefinition is Generating a view */
                        when(viewItem.itemViewType){

                            FieldDefinition.ViewType.EditText.name -> {
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
                                            et.addTextChangedListener(object :TextWatcher {
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
                                    viewObjArray.add(til)
                                    container.addView(til)
                                }
                            }
                            FieldDefinition.ViewType.DropDown.name -> {
                                val view = LayoutInflater.from(this).inflate(R.layout.drop_down_material,null)
                                view?.let{
                                    val dd = it.findViewById<AutoCompleteTextView>(R.id.dd)
                                    val til = view.findViewById<TextInputLayout>(R.id.tiLayout)
                                    til.hint = viewItem.itemViewHint
                                    til.tag = viewItem.itemViewHint
                                    til.apply {
                                        if(parent != null){
                                            (parent as ViewGroup).removeView(this)
                                        }
                                    }
                                    dd.setText("Choose")
                                    val dataArray = viewItem.dropDownValues
                                    val adapter = ArrayAdapter(this@ProposedActivity,R.layout.drop_down_item,
                                        arrayOf("Dhaka","Cumilla","Feni","Chadpur")
                                    )
                                    dd.setAdapter(adapter)

                                    viewObjArray.add(til)
                                    container.addView(til)
                                }
                            }
                            FieldDefinition.ViewType.Button.name -> {

                                val view = LayoutInflater.from(this).inflate(R.layout.button_material,null)
                                view?.let{

                                    val button:Button = it.findViewById(R.id.button)
                                    button.setOnClickListener {


                                        /**Checking up validations for Every View Which was mandatory */
                                        var flag = true
                                        _object.listOfViews?.let { item ->
                                        item.forEach { itemView->
                                            for(savedItem:View in viewObjArray){
                                                if(savedItem.tag.toString().startsWith(itemView.itemViewHint!!)){
                                                    if(itemView.itemViewType == FieldDefinition.ViewType.EditText.name){
                                                        val inp = savedItem.findViewById<TextInputEditText>(R.id.editText)
                                                        flag = flag && itemView.validationCheck(inp.text.toString())
                                                    }
                                                    if(itemView.itemViewType == FieldDefinition.ViewType.DropDown.name){
                                                        val inp = savedItem.findViewById<AutoCompleteTextView>(R.id.dd)
                                                        flag = flag && itemView.validationCheck(inp.text.toString())
                                                    }
                                                }
                                            }
                                            }
                                        }
                                        if(flag){
                                            Toast.makeText(applicationContext,"Making Network Call",Toast.LENGTH_LONG).show()
                                            Intent(this@ProposedActivity,_object.destinationActivity).apply {
                                                this.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
                                                startActivity(this)
                                            }
                                        }else{
                                            Toast.makeText(applicationContext,"All check is not passed",Toast.LENGTH_LONG).show()
                                        }
                                    }


                                    button.text = viewItem.itemViewName
                                    button.foregroundGravity = Gravity.CENTER

                                    button.gravity = Gravity.CENTER
                                    button.apply {
                                        if(parent != null){
                                            (parent as ViewGroup).removeView(this)
                                        }
                                    }
                                    button.tag = "BTN_"
                                    viewObjArray.add(button)
                                    container.addView(button)
                                }
                            }
                        }
                    }
                }
            }
        }
        _object.isModeView?.let { isView ->
            if(isView){

                // =========VIEW BLOCK========= //
                _object.listOfViews?.let { notNullViewList ->
                    notNullViewList.forEach { viewItem->
                        when(viewItem.itemViewType){

                            /** Setting up view to display */
                            FieldDefinition.ViewType.TextView.name -> {
                                val view = LayoutInflater.from(this).inflate(R.layout.text_view_material,null)
                                view?.let { notNullView ->
                                    val til:TextInputLayout = notNullView.findViewById(R.id.til)
                                    val tv:TextView = notNullView.findViewById(R.id.textView)
                                    til.hint = viewItem.itemViewHint
                                    tv.text = viewItem.itemValue
                                    til.apply {
                                        if(parent != null){
                                            (parent as ViewGroup).removeView(this)
                                        }
                                    }
                                    til.tag = "TV_"+viewItem.uniqueIdentifier
                                    viewObjArray.add(til)
                                    container.addView(til)
                                }
                            }
                            FieldDefinition.ViewType.ImageView.name -> {
                                val view = LayoutInflater.from(this).inflate(R.layout.image_view_material,null)
                                view?.let { notNullView ->
                                    val iv:ShapeableImageView = notNullView.findViewById(R.id.imageViewCir)
                                    viewItem.itemValue?.let { notNullStr ->
                                        if(notNullStr.startsWith("http")){
                                            iv.load(notNullStr)
                                        }
                                    }
                                }
                            }
                            FieldDefinition.ViewType.Button.name -> {

                                /** Creating View Programmatically */
                                val view = LayoutInflater.from(this).inflate(R.layout.button_material,null)
                                view?.let { notNullView ->
                                    val button:Button = notNullView.findViewById(R.id.button)
                                    button.text = viewItem.itemViewName
                                    button.foregroundGravity = Gravity.CENTER

                                    /** Setting Up destinition page Provided by Previous page */
                                    button.setOnClickListener{
                                        val intent = Intent(this@ProposedActivity,_object.destinationActivity)
                                        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
                                        startActivity(intent)
                                    }

                                    button.gravity = Gravity.CENTER
                                    button.apply {
                                        if(parent != null){
                                            (parent as ViewGroup).removeView(this)
                                        }
                                    }


                                    /** Storing Views With Tags for Further Modifications */
                                    button.tag = "BTN_"
                                    viewObjArray.add(button)
                                    container.addView(button)
                                }
                            }
                        }

                    }
                }
            }

        }
    }


}