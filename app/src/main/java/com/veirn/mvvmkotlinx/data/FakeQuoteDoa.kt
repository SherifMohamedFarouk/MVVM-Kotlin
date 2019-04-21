package com.veirn.mvvmkotlinx.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class FakeQuoteDoa {
    private val quotelist = mutableListOf<quote>();
    private val quotes = MutableLiveData<List<quote>>();
    init {
        quotes.value = quotelist
    }
    fun addquote(Quote: quote){
        quotelist.add(Quote)
        quotes.value = quotelist
    }
    fun getquote() = quotes as LiveData<List<quote>>
}