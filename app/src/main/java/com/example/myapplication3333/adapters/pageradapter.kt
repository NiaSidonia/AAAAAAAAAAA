package com.example.myapplication3333.adapters

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.myapplication3333.fragments.FirstFragment
import com.example.myapplication3333.fragments.SecondFragment
import com.example.myapplication3333.fragments.ThirdFragment

class pageradapter(activity:AppCompatActivity) :FragmentStateAdapter(activity) {
    override fun getItemCount() = 3

    override fun createFragment(position: Int): Fragment {
        when (position){
            0 -> {
                return FirstFragment()
            }
            1 -> {
                return SecondFragment()
            }
            else -> {
                return ThirdFragment()
            }
        }
    }

}