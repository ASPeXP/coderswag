package com.ipathsaid.coderswag.Controller

import android.content.Intent
import android.content.res.Configuration
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import com.ipathsaid.coderswag.Adapters.ProductsAdapter
import com.ipathsaid.coderswag.R
import com.ipathsaid.coderswag.Services.DataService
import com.ipathsaid.coderswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_product.*

class ProductActivity : AppCompatActivity() {

    lateinit var adapter : ProductsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

       val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        adapter = ProductsAdapter(this, DataService.getProducts(categoryType) ){
            product ->
            val productDetailsIntent = Intent (this, ProductDetailActivity::class.java)
            productDetailsIntent.putExtra("productDetails", product)
            startActivity(productDetailsIntent)
        }

        var spanCount = 2
        val orientation = resources.configuration.orientation
        if(orientation == Configuration.ORIENTATION_LANDSCAPE){
            spanCount = 3
        }

        val layoutmanager = GridLayoutManager(this, spanCount)
        productListView.layoutManager = layoutmanager
        productListView.adapter = adapter

    }
}
