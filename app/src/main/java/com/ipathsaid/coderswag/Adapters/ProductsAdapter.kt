package com.ipathsaid.coderswag.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.ipathsaid.coderswag.Model.Product
import com.ipathsaid.coderswag.R
import kotlinx.android.synthetic.main.product_list_item.view.*

class ProductsAdapter (val context: Context, val products: List<Product>, val itemClick: (Product) -> Unit): RecyclerView.Adapter<ProductsAdapter.ProductHoder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHoder {
         val view = LayoutInflater.from(context).inflate(R.layout.product_list_item, parent, false )
        return ProductHoder(view, itemClick )
    }

    override fun getItemCount(): Int {
       return  products.count()
    }

    override fun onBindViewHolder(holder: ProductHoder, position: Int) {
            holder.bindProduct(products[position], context)
    }

    inner class ProductHoder(itemView: View?,val itemClick: (Product) -> Unit) : RecyclerView.ViewHolder(itemView) {

        val productImage = itemView?.findViewById<ImageView>(R.id.productImg)
        var productName = itemView?.findViewById<TextView>(R.id.productName)
        var productPrice = itemView?.findViewById<TextView>(R.id.productPrice)

        fun bindProduct(product: Product,context: Context ){
            val resourceId = context.resources.getIdentifier(product.image, "drawable", context.packageName)
            productImage?.setImageResource(resourceId)
            productName?.text  = product.title.toString()
            productPrice?.text = product.price.toString()
            itemView.setOnClickListener { itemClick(product) }
        }


    }
}