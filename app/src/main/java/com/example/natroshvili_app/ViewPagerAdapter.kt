package com.example.natroshvili_app
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ViewPagerAdapter(private val items: List<String>) : RecyclerView.Adapter<ViewPagerAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView: TextView = itemView.findViewById(R.id.textView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_page, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = items[position]

        // მხოლოდ პირველ გვერდზე ვაჩვენებთ RecyclerView-ს
        if (position == 0) {
            val recyclerView: RecyclerView = holder.itemView.findViewById(R.id.recyclerView)
            recyclerView.layoutManager = LinearLayoutManager(holder.itemView.context)
            val recyclerItems = (1..20).map { "Item $it" } // 20 ელემენტი
            val recyclerAdapter = RecyclerViewAdapter(recyclerItems)
            recyclerView.adapter = recyclerAdapter
        }    }

    override fun getItemCount(): Int = items.size
}
