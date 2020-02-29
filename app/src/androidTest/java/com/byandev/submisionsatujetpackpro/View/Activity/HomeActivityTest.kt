package com.byandev.submisionsatujetpackpro.View.Activity

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.rule.ActivityTestRule
import com.byandev.submisionsatujetpackpro.Model.Utils.DataDummy
import com.byandev.submisionsatujetpackpro.R
import org.junit.Rule
import org.junit.Test

class HomeActivityTest{
    private val movieCourse = DataDummy.generateDummymovies()
    private val movieTvCourse = DataDummy.generateDummymoviesTv()

    @get:Rule
    var activityRule = ActivityTestRule(HomeActivity::class.java)

    @Test
    fun loadMovie() {
        onView(withId(R.id.rv_academy)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_academy)).perform(RecyclerViewActions.
            scrollToPosition<RecyclerView.ViewHolder>(movieCourse.size))
    }

    @Test
    fun loadDetailMovie(){
        onView(withId(R.id.rv_academy)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.tvTitle)).check(matches(isDisplayed()))
        onView(withId(R.id.tvTitle)).check(matches(withText(movieCourse[0].title)))
    }

    @Test
    fun loadBookmarks() {
        onView(withText("Serial Tv")).perform(click())
        onView(withId(R.id.rv_academy)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_academy)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(movieTvCourse.size))
    }

}