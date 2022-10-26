
package com.shurjomukhi.databindingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.shurjomukhi.databindingapp.Util.responseLoanDetails
import com.shurjomukhi.databindingapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    private lateinit var viewModel: DefaultViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        viewModel = ViewModelProvider(
            this,
            DefaultViewModelFactory(LendingAppRepository(RetrofitInstance.apiForLendingApp))
        )[DefaultViewModel::class.java]

        viewModel.loanDetailsLD.observe(this, Observer {
            when(it){
                is DataState.Loading ->{
                    if(binding.progress.visibility == View.GONE){
                        binding.progress.visibility = View.VISIBLE
                    }
                }
                is DataState.Error ->{
                    if(binding.progress.visibility == View.VISIBLE){
                        binding.progress.visibility = View.GONE
                    }
                }
                is DataState.Success ->{
                    if(binding.progress.visibility == View.VISIBLE){
                        binding.progress.visibility = View.GONE
                    }
                    binding.dataSource = it.data
                    responseLoanDetails = it.data
                }
            }
        })


        binding.apply {
            btn.setOnClickListener {
                if(loanid.text.toString().trim().isNotEmpty()){
                    viewModel.getLoanDetails(
                        loanid.text.toString().trim(),"14f9dd0031392c3b45e4c27b4da38b61a18a0fb2"
                    )
                }else{
                    viewModel.getLoanDetails()
                }

            }
            btnNextPage.setOnClickListener {
                startActivity(Intent(this@MainActivity,RegularActivity::class.java))
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


}