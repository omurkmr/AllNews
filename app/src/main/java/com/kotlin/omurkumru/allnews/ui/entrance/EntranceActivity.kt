package com.kotlin.omurkumru.allnews.ui.entrance

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.kotlin.omurkumru.allnews.R
import kotlinx.android.synthetic.main.activity_entrance.*

class EntranceActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {

    lateinit var countrySpinner: Spinner
    lateinit var catagorySpinner: Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_entrance)

        countrySpinner = this.country_spinner
        catagorySpinner = this.category_spinner

        countrySpinner.onItemSelectedListener = this
        catagorySpinner.onItemSelectedListener = this

        val countryAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, Country.values())
        countryAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        countrySpinner.adapter = countryAdapter

        val categoryAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, Catagory.values())
        categoryAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        catagorySpinner.adapter = categoryAdapter

    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

        when(parent?.id){
            R.id.country_spinner -> Log.i("aaa","cc  "+ position.toString())
            R.id.category_spinner -> Log.i("aaa", position.toString())
        }

    }
}

