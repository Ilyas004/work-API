package com.example.mars.screen.start

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mars.R
import com.example.mars.databinding.ItemMoneyLayoutBinding
import com.example.mars.model.nal.NalichkaItem

class StartAdapter : RecyclerView.Adapter<StartAdapter.StartViewHolder>() {


    var listStart = emptyList<NalichkaItem>()

    class StartViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        val binding = ItemMoneyLayoutBinding.bind(itemView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StartViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_money_layout, parent, false)
        return StartViewHolder(view)
    }

    override fun onBindViewHolder(holder: StartViewHolder, position: Int) {
        holder.binding.tvItemName.text = listStart[position].currencyCodeA.toString()
        holder.binding.tvItemBuy.text = listStart[position].rateBuy.toString()
        holder.binding.tvItemSale.text = listStart[position].rateSell.toString()
    }

    override fun getItemCount(): Int {
        return listStart.size
    }

    @SuppressLint("notifyDataSetChanged")
    fun setList(list: List<NalichkaItem>) {
        listStart = list
        notifyDataSetChanged()
    }
}