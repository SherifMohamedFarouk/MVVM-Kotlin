package com.veirn.mvvmkotlinx.ui.quotes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.veirn.mvvmkotlinx.R
import com.veirn.mvvmkotlinx.data.quote
import com.veirn.mvvmkotlinx.util.injectorUtil
import kotlinx.android.synthetic.main.activity_main.*

class QuotesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            intial()
    }

    fun intial(){
        val factory = injectorUtil.provideviewmodelfactort()
        val viewModel = ViewModelProviders.of(this,factory)
            .get(QuotesViewModel::class.java)

        viewModel.getQuote().observe(this, Observer { quotes ->
            val stringBuilder = StringBuilder()
            quotes.forEach{ quote ->
                stringBuilder.append("$quote\n\n")
            }
            textView_quotes.text = stringBuilder.toString()
        })

        button_add_quote.setOnClickListener {
            val quote = quote(editText_quote.text.toString(), editText_author.text.toString())
            viewModel.addQuote(quote)
            editText_quote.setText("")
            editText_author.setText("")
        }
    }
}
