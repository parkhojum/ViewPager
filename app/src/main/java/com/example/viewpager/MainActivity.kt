package com.example.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewpager.Adapter.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaesActivity() {

    lateinit var mvpa : MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {

        // 뷰페이져용 어댑터 변수 초기화
        mvpa = MainViewPagerAdapter(supportFragmentManager)
        mainViewPager.adapter = mvpa

        //텝레이아웃의 기능으로 뷰페이저에 붙여주기
        myTabLayout.setupWithViewPager(mainViewPager)

    }


}