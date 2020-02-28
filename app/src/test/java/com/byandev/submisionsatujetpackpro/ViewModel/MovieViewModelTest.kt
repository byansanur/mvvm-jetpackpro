package com.byandev.submisionsatujetpackpro.ViewModel

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class MovieViewModelTest {

    private lateinit var viewModel: MovieViewModel

    @Before
    fun case1() {
        viewModel = MovieViewModel()
    }

    @Test
    fun getMovie() {
        val movieEntri = viewModel.getMovie()
        assertNotNull(movieEntri)
        assertEquals(10, movieEntri.size)
    }
}