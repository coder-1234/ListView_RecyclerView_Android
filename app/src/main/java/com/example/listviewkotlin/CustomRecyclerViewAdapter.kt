package com.example.listviewkotlin

import android.app.Activity
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomRecyclerViewAdapter(private val title:Array<String>,
                                private val description:Array<String>)
    : RecyclerView.Adapter<MyViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.custom_list_element, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        return holder.bind(title[position], description[position])
    }

    override fun getItemCount():Int = title.size
}

class MyViewHolder(v:View): RecyclerView.ViewHolder(v), View.OnClickListener{
    private val titleText = v.findViewById<TextView>(R.id.title)
    private val imageView = v.findViewById<ImageView>(R.id.icon)
    private val subtitleText = v.findViewById<TextView>(R.id.description)

    override fun onClick(p0: View?) {
        Log.d("RecyclerView", "CLICK!")
    }

    fun bind(t: String,des: String){
        titleText.text = t
        imageView.setImageResource(R.drawable.ic_launcher_foreground)
        subtitleText.text = des
    }

}