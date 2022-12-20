package com.example.mars.screen.second

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mars.R
import com.example.mars.databinding.ItemMoneyLayoutBinding
import com.example.mars.model.beznal.BezNalOverflow
import com.example.mars.model.beznal.BeznalItem

class SecondAdapter: RecyclerView.Adapter<SecondAdapter.SecondViewHolder>() {


    private var listSecond = BezNalOverflow.listBeznalItem

    class SecondViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val binding = ItemMoneyLayoutBinding.bind(itemView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SecondViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_money_layout, parent, false)
        return SecondViewHolder(view)
    }

    override fun onBindViewHolder(holder: SecondViewHolder, position: Int) {
        holder.binding.tvItemName.text = listSecond[position].name
        holder.binding.tvItemBuy.text = listSecond[position].rateBuy.toString()
        holder.binding.tvItemSale.text = listSecond[position].rateSell.toString()
    }

    override fun getItemCount(): Int {
        return listSecond.size
    }

    @SuppressLint("notifyDataSetChanged")
    fun setList(list: List<BeznalItem>) {
        listSecond = list as ArrayList<BeznalItem>
        notifyDataSetChanged()
    }
}