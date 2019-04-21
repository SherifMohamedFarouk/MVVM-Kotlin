package com.veirn.mvvmkotlinx.ui.quotes

import androidx.lifecycle.ViewModel
import com.veirn.mvvmkotlinx.data.QuoteRepository
import com.veirn.mvvmkotlinx.data.quote

class QuotesViewModel(val quoteRepository: QuoteRepository)
    :ViewModel() {

    fun addQuote(quote: quote){
        quoteRepository.addQuote(quote)

    }
    fun getQuote() = quoteRepository.getQuote()
}