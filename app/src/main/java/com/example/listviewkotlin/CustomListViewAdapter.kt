package com.example.listviewkotlin

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomAdapter(private val context:Activity, private val title: Array<String>,
                    private val description: Array<String>)
    :ArrayAdapter<String> (context,R.layout.custom_list_element,title) {
    override fun getView(position: Int, view: View?, parent: ViewGroup):View{
        val rowView = context.layoutInflater.inflate(R.layout.custom_list_element,null,true)
        val titleText = rowView.findViewById<TextView>(R.id.title)
        val imageView = rowView.findViewById<ImageView>(R.id.icon)
        val subtitleText = rowView.findViewById<TextView>(R.id.description)

        titleText.text = title[position]
        imageView.setImageResource(R.drawable.ic_launcher_foreground)
        subtitleText.text = description[position]
        return rowView
    }
}