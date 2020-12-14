package com.cbellmont.ejemploadaptersinlista

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class StringAdapter() : RecyclerView.Adapter<StringAdapter.StringViewHolder>()  {

    class StringViewHolder(var root: View, var textView: TextView) : RecyclerView.ViewHolder(root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StringViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        val twTextView = view.findViewById<TextView>(R.id.textView)
        return StringViewHolder(view, twTextView)
    }

    override fun getItemCount(): Int {
        //return 7
        return 10
    }

    override fun onBindViewHolder(holder: StringViewHolder, position: Int) {
        holder.textView.text = "Position = $position"

        if (position % 2 != 0) {
            holder.textView.text = "Soy impar"
        } else {
            holder.textView.setBackgroundColor(22)
        }

        if (position  == 9) {
            holder.textView.text = "Soy el último"
        }

    }

}

