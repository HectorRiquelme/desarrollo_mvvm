package com.example.desarrollo_mvvm.view

import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.desarrollo_mvvm.databinding.ActivityMainBinding
import com.example.desarrollo_mvvm.viewmodel.QuoteViewModel

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding
    private val quoteViewModel : QuoteViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        quoteViewModel.quoteModel.observe(this, Observer {
                binding.tvQuote.text= it.quote
                binding.tvAuthor.text= it.author
            })

            binding.viewContainer.setOnClickListener { quoteViewModel.randomQuote() }

    }
}