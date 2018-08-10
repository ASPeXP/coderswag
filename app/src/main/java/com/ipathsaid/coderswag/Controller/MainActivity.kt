package com.ipathsaid.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.ArrayAdapter
import android.widget.Toast
//import com.ipathsaid.coderswag.Adapters.CategoryAdapter
import com.ipathsaid.coderswag.Adapters.CategoryRecycleAdapter
import com.ipathsaid.coderswag.Model.Category
import com.ipathsaid.coderswag.R
import com.ipathsaid.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      //  adapter = ArrayAdapter(this,
       //         android.R.layout.simple_list_item_1,
         //       DataService.categories)

        adapter = CategoryRecycleAdapter(this, DataService.categories)

        categoryListView.adapter = adapter

        val layoutManger = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManger
        categoryListView.setHasFixedSize(true )




        }


    }

