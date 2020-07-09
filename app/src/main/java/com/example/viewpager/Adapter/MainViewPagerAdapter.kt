package com.example.viewpager.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.viewpager.fragment.FirstFragment
import com.example.viewpager.fragment.SecondFragment

class MainViewPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "첫번째 Frag"
            else -> "두번째 Frag"
        }
    }


    override fun getItem(position: Int): Fragment {

//        when (position) {
//            0 -> {return FirstFragment()}
//            else -> {return SecondFragment()}
//        }

        // when + return 결합 특수 형태
//       return when (position) {
//           0 -> FirstFragment()
//           else -> SecondFragment()
//       }


        if (position == 0){
            return  FirstFragment()
        }
        else{
            return SecondFragment()
        }
    }

    override fun getCount(): Int {

        return 2
    }


}