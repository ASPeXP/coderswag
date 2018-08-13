package com.ipathsaid.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.ipathsaid.coderswag.R
import com.ipathsaid.coderswag.Utilities.EXTRA_CATEGORY

class ProductActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

       val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        println("category type: " + categoryType)
    }
}
