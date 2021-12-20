package com.example.menuapp

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.menuapp.databinding.ActivityHomeBinding

class Home : AppCompatActivity() {
    lateinit var binding: ActivityHomeBinding
    lateinit var sharedPreferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val text = intent.extras!!.getString("text")
        binding.textView3.text = text
        sharedPreferences = this.getSharedPreferences("share", Context.MODE_PRIVATE)
    }

    fun displayShare(view: View) {
        binding.textView3.text = sharedPreferences.getString("saveText","error")
    }
}