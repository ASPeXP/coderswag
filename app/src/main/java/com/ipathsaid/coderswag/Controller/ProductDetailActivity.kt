package com.ipathsaid.coderswag.Controller

import android.content.res.Resources
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.ipathsaid.coderswag.Model.Product
import com.ipathsaid.coderswag.R
import kotlinx.android.synthetic.main.activity_product_detail.*

class ProductDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)

        val productDetail = intent.getParcelableExtra<Product>("productDetails")

        productNameTextview.text = productDetail.title
        productPriceTextview.text = productDetail.price

        val res: Resources = getResources()
        val resourceID = res.getIdentifier(productDetail.image, "drawable", packageName)
        val drawableRes = res.getDrawable(resourceID)

        productImg.setImageDrawable(drawableRes)
    }
}
