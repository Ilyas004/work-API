package com.example.mars.screen.start

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.recyclerview.widget.RecyclerView
import com.example.mars.data.repository.Repository
import com.example.mars.model.nal.Nalichka
import kotlinx.coroutines.launch
import retrofit2.Response

class StartViewModel : ViewModel() {

    var repo = Repository()
    val myMoneyList: MutableLiveData<Response<Nalichka>> = MutableLiveData()

    fun getNalMoney() {
        viewModelScope.launch {
            myMoneyList.value = repo.getNal()
        }
    }
}