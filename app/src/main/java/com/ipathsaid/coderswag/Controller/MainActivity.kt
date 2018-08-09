package com.ipathsaid.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.ipathsaid.coderswag.Adapters.CategoryAdapter
import com.ipathsaid.coderswag.Model.Category
import com.ipathsaid.coderswag.R
import com.ipathsaid.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      //  adapter = ArrayAdapter(this,
       //         android.R.layout.simple_list_item_1,
         //       DataService.categories)

        adapter = CategoryAdapter(this, DataService.categories)

        categoryListView.adapter = adapter



    }
}
