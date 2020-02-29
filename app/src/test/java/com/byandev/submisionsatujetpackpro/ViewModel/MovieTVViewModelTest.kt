package com.byandev.submisionsatujetpackpro.ViewModel

import com.byandev.submisionsatujetpackpro.Model.Data.MovieTvEntity
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class MovieTVViewModelTest {

    private lateinit var viewModel: MovieTVViewModel

    @Before
    fun case2(){
        viewModel = MovieTVViewModel()
    }

    @Test
    fun getMovieTv() {
        val movieEntri = viewModel.getMovieTv()
        assertNotNull(movieEntri)
        assertEquals(10, movieEntri.size)
    }
}