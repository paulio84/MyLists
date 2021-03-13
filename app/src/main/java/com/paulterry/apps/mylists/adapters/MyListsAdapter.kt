package com.paulterry.apps.mylists.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.paulterry.apps.mylists.R
import com.paulterry.apps.mylists.models.ListItem

class MyListsAdapter(private val dataSet: List<ListItem>) :
    RecyclerView.Adapter<MyListsAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val listItemText: TextView = view.findViewById(R.id.listItemText)
        val listItemDescription: TextView = view.findViewById(R.id.listItemDescription)
        val listItemLink: Button = view.findViewById(R.id.listItemLinkButton)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.listItemText.text = dataSet[position].text

        holder.listItemDescription.visibility = View.INVISIBLE
        dataSet[position].description?.let {
            holder.listItemDescription.visibility = View.VISIBLE
            holder.listItemDescription.text = dataSet[position].description
        }

        holder.listItemLink.visibility = View.GONE
        dataSet[position].link?.let {
            holder.listItemLink.visibility = View.VISIBLE
            holder.listItemLink.text = dataSet[position].link
        }
    }

    override fun getItemCount(): Int = dataSet.size
}