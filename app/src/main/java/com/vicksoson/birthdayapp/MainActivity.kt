package com.vicksoson.birthdayapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintSet
import com.vicksoson.birthdayapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var binding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        binding?.button?.setOnClickListener {
            binding?.imageView?.visibility = View.VISIBLE
            binding?.layout?.setBackgroundResource(R.drawable.happy_birthday)
        }

    }
}