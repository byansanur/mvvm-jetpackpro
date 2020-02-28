package com.byandev.submisionsatujetpackpro.Model.Helper

import android.content.Context
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.byandev.submisionsatujetpackpro.View.Fragment.MovieListFragment
import com.byandev.submisionsatujetpackpro.View.Fragment.MovieTvListFragment
import com.byandev.submisionsatujetpackpro.R

class ViewPagerAdapter(private val context: Context, fm: FragmentManager) : FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT){
    companion object{
        @StringRes
        private val TAB_TITLES = intArrayOf(R.string.movies, R.string.moviesTv)
    }
    override fun getItem(position: Int): Fragment =
        when(position) {
            0 -> MovieListFragment()
            1 -> MovieTvListFragment()
            else -> Fragment()
        }
    override fun getPageTitle(position: Int): CharSequence? = context.resources.getString(TAB_TITLES[position])

    override fun getCount(): Int = 2
}