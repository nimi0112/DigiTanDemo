package com.grappus.digitan.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.grappus.digitan.R
import kotlinx.android.synthetic.main.item_sample.view.*

/**
 * Created by nimish@grappus.com on 23/12/2019.
 * Description -
 */

class DemoRecyclerViewAdapter(
    private val myListener: (Int) -> Unit
) : RecyclerView.Adapter<DemoRecyclerViewAdapter.SampleAdapterViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = SampleAdapterViewHolder(
        LayoutInflater.from(parent.context).inflate(
            R.layout.item_sample,
            parent,
            false
        )
    )

    override fun getItemCount(): Int = 5

    override fun onBindViewHolder(holder: SampleAdapterViewHolder, position: Int) {
        holder.parentView.setOnClickListener {
            myListener(position)
        }
    }

    class SampleAdapterViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val parentView = view.card_view
    }

}