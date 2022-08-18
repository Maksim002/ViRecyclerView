package com.example.myapplicationvirecycler_pager

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_recycler.view.*


class RecyclerAdapter (var list: ArrayList<Int> = arrayListOf()) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    fun update(addList: ArrayList<Int>){
        list = addList
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recycler, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        ViewHolder(holder.itemView).bind(list[position], holder)
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        fun bind(item : Int ,holder: RecyclerView.ViewHolder) = with(holder.itemView){
            number.text = item.toString()
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }
}