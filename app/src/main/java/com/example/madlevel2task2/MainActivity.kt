package com.example.madlevel2task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.madlevel2task2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val statements = arrayListOf<Statement>()
    private val statementAdapter = StatementAdapter(statements)
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {
        binding.rvStatements.layoutManager = LinearLayoutManager(this@MainActivity, RecyclerView.VERTICAL, false)
        binding.rvStatements.adapter = statementAdapter

        for(i in Statement.STATEMENTS.indices) {
            statements.add(Statement(Statement.STATEMENTS[i], Statement.STATEMENT_ANSWERS[i]))
        }
        statementAdapter.notifyDataSetChanged()
    }
}