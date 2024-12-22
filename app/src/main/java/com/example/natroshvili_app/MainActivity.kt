package com.example.natroshvili_app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager: ViewPager2 = findViewById(R.id.viewPager)
        val items = listOf("Page 1", "Page 2", "Page 3", "Page 4")
        val adapter = ViewPagerAdapter(items)

        viewPager.adapter = adapter
    }
}