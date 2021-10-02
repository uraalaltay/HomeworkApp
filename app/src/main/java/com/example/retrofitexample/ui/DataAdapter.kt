package com.example.retrofitexample.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.retrofitexample.R
import com.example.retrofitexample.model.model.Camera
import kotlinx.android.synthetic.main.list_item_card.view.*

class DataAdapter(private var dataList: List<Camera>) :
    RecyclerView.Adapter<DataAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.image_view
        val textView: TextView = itemView.text_view
        val textView2: TextView = itemView.text_view2
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.list_item_card, parent, false)
    )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val dataModel = dataList[position]

        holder.imageView.load(dataModel.fullName) {
            placeholder(R.drawable.ic_launcher_background)
        }
        holder.textView.text = dataModel.name
        holder.textView2.text = dataModel.id.toString()
    }

    override fun getItemCount() = dataList.size
}