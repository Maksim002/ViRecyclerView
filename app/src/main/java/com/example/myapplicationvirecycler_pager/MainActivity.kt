package com.example.myapplicationvirecycler_pager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listRecycler: ArrayList<Int> = arrayListOf()
        for (i in 0..60){
            listRecycler.add(i)
        }

        val adapter = RecyclerAdapter()
        adapter.update(listRecycler)
        RView.adapter = adapter


    }
}