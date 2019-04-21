package com.veirn.mvvmkotlinx.data

data class quote(val quotetext : String ,
                 val author:String ) {
    override fun toString(): String {
        return "quote('$quotetext' - '$author')"
    }
}