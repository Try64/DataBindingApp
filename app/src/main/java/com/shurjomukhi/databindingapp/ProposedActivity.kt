package com.shurjomukhi.databindingapp

import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import com.google.gson.Gson

class ProposedActivity : BaseIOActivity() {

    private var isEdit = false
    private lateinit var listViews:GsonObjToShip
    private var viewObjArray:ArrayList<View> = ArrayList()
    private lateinit var container:LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_proposed)

        container = findViewById(R.id.holderLayout)

        /**
         *  Getting configuration from
         *  Previous Page
         *
         *  NB. here intent is the link from previous page
         */
        if(intent.hasExtra(Util.ViewOperation.MODE_EDIT.name)){
            isEdit = intent.getBooleanExtra(Util.ViewOperation.MODE_EDIT.name,false)
        }
        if(intent.hasExtra(Util.ViewOperation.VIEW_DATA.name)){
            listViews = Gson().fromJson(intent.getStringExtra(Util.ViewOperation.VIEW_DATA.name),GsonObjToShip::class.java)
        }


        viewSetup()

    }

    private fun viewSetup(){
        if(!isEdit){

            /**
             * Generate Views for ONLY_VIEW
             */
            listViews.list.let { listOfViewDefinition ->

                viewObjArray.clear()

                for (item:ItemViewDefinition in listOfViewDefinition){

                    when(item.itemViewType){

                        ItemViewDefinition.ViewType.TextView.name -> {

                            val view = LayoutInflater.from(this).inflate(R.layout.text_view_material,null)
                            view?.let { notNullView ->
                                val til:TextInputLayout = notNullView.findViewById(R.id.til)
                                val tv:TextView = notNullView.findViewById(R.id.textView)
                                til.hint = item.itemViewHint
                                tv.text = item.placeholderInObject
                                til.apply {
                                    if(parent != null){
                                        (parent as ViewGroup).removeView(this)
                                    }
                                }
                                til.tag = "TV_"+item.itemViewHint
                                //til.setTag(0,"TV_"+item.itemViewHint)
                                viewObjArray.add(til)
                                container.addView(til)
                            }
                        }
                        ItemViewDefinition.ViewType.Button.name -> {

                            val view = LayoutInflater.from(this).inflate(R.layout.button_material,null)
                            view?.let { notNullView ->
                                val button:Button = notNullView.findViewById(R.id.button)
                                button.text = item.itemViewName
                                button.setOnClickListener{
                                    for(savedItem:View in viewObjArray){
                                        if(savedItem.tag.toString().startsWith("ET")){
                                            val inp = savedItem.findViewById<TextInputEditText>(R.id.editText)
                                            Toast.makeText(this,inp.text.toString(),Toast.LENGTH_LONG).show()
                                        }
                                    }
                                    finish()
                                }
                                button.gravity = Gravity.CENTER
                                button.apply {
                                    if(parent != null){
                                        (parent as ViewGroup).removeView(this)
                                    }
                                }
                                button.tag = "BTN_"
                                //button.setTag(0,"BTN_")  //will be added page name
                                viewObjArray.add(button)
                                container.addView(button)
                            }
                        }
                        ItemViewDefinition.ViewType.EditText.name -> {
                            val view = LayoutInflater.from(this).inflate(R.layout.edit_text_material,null)
                            view?.let{
                                val til = view.findViewById<TextInputLayout>(R.id.tiLayout)
                                val et = view.findViewById<TextInputEditText>(R.id.editText)
                                til.hint = item.itemViewHint
                                til.tag = "ET_"+item.itemViewHint
                                //til.setTag(0,"ET_"+item.itemViewHint)
                                til.apply {
                                    if(parent != null){
                                        (parent as ViewGroup).removeView(this)
                                    }
                                }
                                viewObjArray.add(til)
                                container.addView(til)
                            }
                        }
                    }
                }
            }
        }
        else{
            /**
             * Generate Views for INPUT_VALUS
             */
            listViews.list.let {
                viewObjArray.clear()
                for (item:ItemViewDefinition in it){
                    when(item.itemViewType){
                        ItemViewDefinition.ViewType.TextView.name -> {
                            val view = LayoutInflater.from(this).inflate(R.layout.text_view_material,null)
                            view?.let { notNullView ->
                                val til:TextInputLayout = notNullView.findViewById(R.id.til)
                                val tv:TextView = notNullView.findViewById(R.id.textView)
                                til.hint = item.itemViewHint
                                tv.text = item.placeholderInObject
                                til.apply {
                                    if(parent != null){
                                        (parent as ViewGroup).removeView(this)
                                    }
                                }
                                viewObjArray.add(til)
                                container.addView(til)
                            }
                        }
                        ItemViewDefinition.ViewType.Button.name -> {
                            val view = LayoutInflater.from(this).inflate(R.layout.button_material,null)
                            view?.let { notNullView ->
                                val button:Button = notNullView.findViewById(R.id.button)
                                button.text = item.itemViewName
                                button.setOnClickListener{
                                    finish()
                                }
                                button.gravity = Gravity.CENTER
                                button.apply {
                                    if(parent != null){
                                        (parent as ViewGroup).removeView(this)
                                    }
                                }

                                container.addView(button)
                            }
                        }
                    }
                }
            }
        }
    }


}