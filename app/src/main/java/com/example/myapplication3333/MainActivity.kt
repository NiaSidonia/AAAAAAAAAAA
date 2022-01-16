package com.example.myapplication3333

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TableLayout
import androidx.viewpager2.widget.ViewPager2
import com.example.myapplication3333.adapters.pageradapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var tab : TabLayout
    private lateinit var viewpager : ViewPager2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tab = findViewById(R.id.tab)
        viewpager = findViewById(R.id.viewpager)
        viewpager.adapter = pageradapter(this)
        TabLayoutMediator(tab, viewpager){tab,position ->
            when (position){
                0 -> {
                    tab.text = "zd1"
                }
                1 -> {
                    tab.text = "zd2"
                }
                2 -> {
                    tab.text = "zd3"
                }

            }
        }.attach()
    }
}