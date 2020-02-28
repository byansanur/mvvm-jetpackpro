package com.byandev.submisionsatujetpackpro.View.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.byandev.submisionsatujetpackpro.Model.Helper.ViewPagerAdapter
import com.byandev.submisionsatujetpackpro.R
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val pagerAdapter = ViewPagerAdapter(this, supportFragmentManager)
        view_pager.adapter = pagerAdapter
        tabs.setupWithViewPager(view_pager)

        supportActionBar?.elevation = 0f
        supportActionBar?.title = "Home"
    }
}
