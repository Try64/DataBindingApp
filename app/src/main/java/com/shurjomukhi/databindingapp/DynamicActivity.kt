package com.shurjomukhi.databindingapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import coil.load
import com.shurjomukhi.databindingapp.Util.responseLoanDetails
import com.shurjomukhi.databindingapp.databinding.ActivityDynamicBinding

class DynamicActivity : AppCompatActivity(),View.OnClickListener{
    private lateinit var binding: ActivityDynamicBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this@DynamicActivity,R.layout.activity_dynamic)
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
        startActivity(Intent(this@DynamicActivity, MainActivity::class.java).setFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK))
    }


}