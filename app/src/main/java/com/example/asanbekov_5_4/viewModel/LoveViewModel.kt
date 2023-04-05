package com.example.asanbekov_5_4.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.asanbekov_5_4.remote.LoveModel
import com.example.asanbekov_5_4.repository.Repository


class LoveViewModel : ViewModel() {

    private val repository = Repository()

    fun getLiveLoveModel(firstName: String, secondName: String): LiveData<LoveModel>{
        return repository.getPercentage(firstName, secondName)
    }
}