package com.byandev.submisionsatujetpackpro.ViewModel

import com.byandev.submisionsatujetpackpro.Model.Utils.DataDummy
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class DetailViewModelTest {

    private lateinit var viewModel: DetailViewModel
    private val movie = DataDummy.generateDummymovies()[0]
    private val tv = DataDummy.generateDummymoviesTv()[0]
    private val movieId = movie.movieId
    private val movieTvId = tv.movieTvId

    @Before
    fun setUpDetailMovie(){
        viewModel = DetailViewModel()
        viewModel.setSelectedMovie(movieId)
        viewModel.setSelectedMovieTv(movieTvId)
    }

    @Test
    fun getMovie() {
        viewModel.setSelectedMovie(movie.movieId)
        val movEntri = viewModel.getMovie()
        assertNotNull(movEntri)
        if (movEntri != null) {
            assertEquals(movie.movieId, movEntri.movieId)
            assertEquals(movie.title, movEntri.title)
            assertEquals(movie.description, movEntri.description)
            assertEquals(movie.imagePath, movEntri.imagePath)
            assertEquals(movie.penulis, movEntri.penulis)
            assertEquals(movie.ph, movEntri.ph)
            assertEquals(movie.producer, movEntri.producer)
            assertEquals(movie.sutradara, movEntri.sutradara)
            assertEquals(movie.thnRilis, movEntri.thnRilis)
        }
    }

    @Test
    fun getMovieTv() {
        viewModel.setSelectedMovieTv(tv.movieTvId)
        val tvEntri = viewModel.getMovieTv()
        assertNotNull(tvEntri)
        if (tvEntri != null) {
            assertEquals(tv.movieTvId, tvEntri.movieTvId)
            assertEquals(tv.title, tvEntri.title)
            assertEquals(tv.description, tvEntri.description)
            assertEquals(tv.imagePath, tvEntri.imagePath)
            assertEquals(tv.penulis, tvEntri.penulis)
            assertEquals(tv.ph, tvEntri.ph)
            assertEquals(tv.producer, tvEntri.producer)
            assertEquals(tv.sutradara, tvEntri.sutradara)
            assertEquals(tv.thnRilis, tvEntri.thnRilis)
        }
    }
}