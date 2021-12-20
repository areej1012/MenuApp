package com.example.menuapp

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import com.example.menuapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var sharedPreferences : SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        sharedPreferences = this.getSharedPreferences("share", Context.MODE_PRIVATE)

    }

    fun shareIntent(view: View) {
        val intent = Intent(this, Home :: class.java)
        intent.putExtra("text", binding.etText1.text.toString())
        startActivity(intent)
    }
    fun saveData(view: View) {
        val text = binding.etText2.text.toString()
        with(sharedPreferences.edit()){
            putString("saveText",text)
            apply()
        }
    }


}