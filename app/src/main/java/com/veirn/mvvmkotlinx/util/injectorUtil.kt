package com.veirn.mvvmkotlinx.util

import com.veirn.mvvmkotlinx.data.FakeDatabase
import com.veirn.mvvmkotlinx.data.QuoteRepository
import com.veirn.mvvmkotlinx.ui.quotes.QuotesViewModelFactory

object injectorUtil {

    fun provideviewmodelfactort():QuotesViewModelFactory{
        val quoteRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDoa)
        return QuotesViewModelFactory(quoteRepository)
    }
}