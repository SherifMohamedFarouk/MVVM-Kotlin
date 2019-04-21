package com.veirn.mvvmkotlinx.ui.quotes

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.veirn.mvvmkotlinx.data.QuoteRepository

class QuotesViewModelFactory(private val  quoteRepository: QuoteRepository)
    :ViewModelProvider.NewInstanceFactory()  {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return QuotesViewModel(quoteRepository) as T
    }

}