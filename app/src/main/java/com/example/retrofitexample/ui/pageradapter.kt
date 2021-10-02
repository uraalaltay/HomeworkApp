package com.example.retrofitexample.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.retrofitexample.CuriosityFragment
import com.example.retrofitexample.Fragment2
import com.example.retrofitexample.Fragment3

class pageradapter(fm:FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 3;
    }

    override fun getItem(position: Int): Fragment {
        return when(position) {
            0 -> {
                CuriosityFragment()
            }
            1 -> {
                Fragment2()
            }
            2 -> {
                Fragment3()
            }
            else -> {
                CuriosityFragment()
            }
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position) {
            0 -> {
                return "Curiosity"
            }
            1 -> {
                return "Opportunity"
            }
            2 -> {
                return "Spirit"
            }
        }
        return super.getPageTitle(position)
    }

}
