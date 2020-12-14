package com.example.madlevel2task2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.madlevel2task2.databinding.ItemStatementBinding

class StatementAdapter (private val statements: List<Statement>) : RecyclerView.Adapter<StatementAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val binding = ItemStatementBinding.bind(itemView)

        fun databind(statement: Statement) {
            binding.tvStatement.text = statement.text
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_statement, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return statements.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.databind(statements[position])
    }
}