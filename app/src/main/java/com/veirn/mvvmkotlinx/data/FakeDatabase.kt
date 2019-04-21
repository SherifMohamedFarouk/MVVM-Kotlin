package com.veirn.mvvmkotlinx.data

class FakeDatabase private  constructor(){

    var quoteDoa = FakeQuoteDoa()
            private set

    companion object{
        @Volatile private var instance: FakeDatabase? = null
        fun getInstance() =
            instance ?: synchronized(this){
            instance ?: FakeDatabase().also { instance = it }
        }

    }


}