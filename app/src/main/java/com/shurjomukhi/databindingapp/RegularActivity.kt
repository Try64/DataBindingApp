package com.shurjomukhi.databindingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.TextView
import coil.load
import com.google.android.material.textfield.TextInputEditText
import com.shurjomukhi.databindingapp.Util.responseLoanDetails

class RegularActivity : AppCompatActivity() {
    private lateinit var dynamicButton:Button

    private lateinit var profileImage:ImageView
    private lateinit var nameTV:TextView
    private lateinit var phoneTV:TextView
    private lateinit var loanTV:TextView
    private lateinit var amountTenureTV:TextView
    private lateinit var milkRadioButton: RadioButton
    private lateinit var meatRadioButton: RadioButton
    private lateinit var loanTenureET:TextInputEditText
    private lateinit var loanAmountET:TextInputEditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regular)

        initViews()

        responseLoanDetails?.let {
            loadData()
        }
    }

    private fun loadData():Unit {
        profileImage.load(responseLoanDetails?.borrower?.person?.photoUrlOnNid)
        nameTV.text = responseLoanDetails!!.borrower!!.person!!.fullNameEn ?: "Empty"
        phoneTV.text = "Phone: "+(responseLoanDetails!!.borrower!!.person!!.contactInfo?.primaryPhoneNumber ?: "Empty")
        loanTV.text = "Loan ID: "+(responseLoanDetails!!.loanId ?: "Empty")

        if(responseLoanDetails?.amount != null && responseLoanDetails?.tenure != null){
            responseLoanDetails?.tenure?.let {
                loanTenureET.setText(it.toString())
            }
            responseLoanDetails?.amount?.let {
                loanAmountET.setText(it.toString())
            }
            amountTenureTV.text = "Amount = ${responseLoanDetails?.amount} BDT, Tenure = ${responseLoanDetails?.tenure} Months"
        }else{
            amountTenureTV.text = "Amount is Empty and Tenure is Empty"
        }

        responseLoanDetails?.loanObjective?.let {
            if(it.isNotEmpty()){
                if(it == "MEAT_PRODUCTION"){
                    meatRadioButton.isChecked = true
                    milkRadioButton.isChecked = false
                }else if(it == "MILK_PRODUCTION"){
                    meatRadioButton.isChecked = false
                    milkRadioButton.isChecked = true
                }
            }
        }


    }


    private fun initViews():Unit{

        dynamicButton = findViewById<Button>(R.id.btnDynamicPage)
        profileImage = findViewById<ImageView>(R.id.borrowerImage)
        nameTV = findViewById<TextView>(R.id.name)
        phoneTV = findViewById<TextView>(R.id.phone)
        loanTV = findViewById<TextView>(R.id.loanID)
        amountTenureTV = findViewById<TextView>(R.id.amountAndTenure)
        milkRadioButton = findViewById<RadioButton>(R.id.milk_radio)
        meatRadioButton = findViewById<RadioButton>(R.id.meat_radio)
        loanTenureET = findViewById<TextInputEditText>(R.id.loanTenure)
        loanAmountET = findViewById<TextInputEditText>(R.id.loanAmount)


        dynamicButton.setOnClickListener{
            startActivity(Intent(this@RegularActivity,DynamicActivity::class.java))
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
}