package com.example.list_presidenri.adapter

import android.annotation.SuppressLint
import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.list_presidenri.R

class Presiden_Adapter(private val context: Activity, private val title : Array<String>, private val deskripsi: Array<String>, private val idimg:Array<Int>)
        : ArrayAdapter<String>(context, R.layout.style_layout,title){

        @SuppressLint("ViewHolder")
        override fun getView(position: Int, view: View?, parent: ViewGroup): View {
            val inflater = context.layoutInflater
            val rowView = inflater.inflate(R.layout.style_layout,null,true)

            val titleText = rowView.findViewById(R.id.title) as TextView
            val imageView = rowView.findViewById(R.id.icon) as ImageView
            val subtitleText = rowView.findViewById(R.id.deskripsi) as TextView

            titleText.text = title[position]
            imageView.setImageResource(idimg[position])
            subtitleText.text = deskripsi[position]

            return rowView
        }


    }