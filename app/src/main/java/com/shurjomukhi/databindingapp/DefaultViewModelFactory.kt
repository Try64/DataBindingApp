package com.shurjomukhi.databindingapp

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

@Suppress("UNCHECKED_CAST")
class DefaultViewModelFactory(private val repository: LendingAppRepository):ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(DefaultViewModel::class.java)){
            return DefaultViewModel(repository) as T
        }
        throw IllegalArgumentException("ViewModel not found")
    }
}