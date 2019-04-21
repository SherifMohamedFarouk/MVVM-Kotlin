package com.veirn.mvvmkotlinx.data

class QuoteRepository private constructor(val quoteDoa: FakeQuoteDoa) {

    fun addQuote(quote: quote){
        quoteDoa.addquote(quote)
    }
    fun getQuote() = quoteDoa.getquote()

    companion object {
        @Volatile
        private var instance: QuoteRepository? = null

        fun getInstance(quoteDoa: FakeQuoteDoa) =
            instance ?: synchronized(this) {
                instance ?: QuoteRepository(quoteDoa).also { instance = it }
            }

    }

}