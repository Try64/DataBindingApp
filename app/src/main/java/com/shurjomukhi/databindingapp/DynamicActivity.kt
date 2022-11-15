package com.shurjomukhi.databindingapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import coil.load
import com.google.gson.Gson
import com.shurjomukhi.databindingapp.Util.ObjectV0
import com.shurjomukhi.databindingapp.Util.responseLoanDetails
import com.shurjomukhi.databindingapp.databinding.ActivityDynamicBinding

class DynamicActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityDynamicBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this@DynamicActivity, R.layout.activity_dynamic)
        binding.buttonClickHandler = this

        /**
         * Load Data using DataBinding if available
         */
        responseLoanDetails?.let {
            binding.loanDetails = it
        }

        /**
         * manual data load, to avoid creating
         * custom binding adapter
         * @see DataBindingUtil
         */
        pushDataIfAvailable()

    }

    private fun pushDataIfAvailable() {
        responseLoanDetails?.borrower?.person?.photoUrlOnNid?.let { url ->
            binding.borrowerImage.load(url)
        }
        responseLoanDetails?.amount?.let { amount ->
            responseLoanDetails?.tenure?.let { tenure ->
                binding.amountAndTenure.text = "Amount : $amount BDT. Tenure : $tenure Months"
            }
        }
    }

    override fun onResume() {
        super.onResume()
        supportActionBar?.hide()
    }

    override fun onStop() {
        super.onStop()
        supportActionBar?.show()
    }

    override fun onClick(p0: View?) {


        /**
         * Lets Generate First View for Farm Information
         */

        var dataSourceObjectV0: DataSourceObjectV0? = null

        dataSourceObjectV0 = DataSourceObjectV0(
            listOfViews = null,
            destinationActivity = MainActivity::class.java,// TODO: Should
            isModeEdit = true,
            isModeView = false,
            submitOnline = false,
            endPoint = null,
            dataModel = null,
            pageTitle = "Edit Mode",// TODO: Page title should be controlled by the owner by default
            onBackPressed = {
                Toast.makeText(applicationContext, "You are pressing Back", Toast.LENGTH_LONG)
                    .show()
            }
        )

        /**First view all data
         *
         */
        val field0 = FieldDefinitionV0(isAmountField = false,
            itemViewType = FieldDefinition.ViewType.TextView.name,
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

        val field1 = FieldDefinitionV0(isAmountField = true,
            itemViewType = FieldDefinition.ViewType.EditText.name,
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

        val array = ArrayList<FieldDefinitionV0>()
        array.add(field1)
        array.add(field2)
        array.add(field3)
        dataSourceObjectV0.listOfViews = array
        dataSourceObjectV0.isModeEdit = true


        ObjectV0 = dataSourceObjectV0

       // val str = Gson().toJson(ObjectV0)


        val intent0 = Intent(this@DynamicActivity, ProposedActivity0::class.java)
        intent0.putExtra("DATA", ObjectV0)
        startActivity(intent0)

    }


}