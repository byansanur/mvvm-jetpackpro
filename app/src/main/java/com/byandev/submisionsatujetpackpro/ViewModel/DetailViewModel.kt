package com.byandev.submisionsatujetpackpro.ViewModel

import androidx.lifecycle.ViewModel
import com.byandev.submisionsatujetpackpro.Model.Data.MovieEntity
import com.byandev.submisionsatujetpackpro.Model.Data.MovieTvEntity
import com.byandev.submisionsatujetpackpro.Model.Utils.DataDummy

class DetailViewModel : ViewModel() {
    private lateinit var movieId: String
    private lateinit var movieTvId: String

    fun setSelectedMovie(movieId: String) {
        this.movieId = movieId
    }

    fun setSelectedMovieTv(movieTvId: String) {
        this.movieTvId = movieTvId
    }



    fun getMovie(): MovieEntity? {
        var mov: MovieEntity? = null
        for (movieEntitiy in DataDummy.generateDummymovies()) {
            if (movieEntitiy.movieId == movieId){
                mov = movieEntitiy
            }
        }
        return mov
    }

    fun getMovieTv(): MovieTvEntity? {
        var movt: MovieTvEntity? = null
        for (movieTvEntitiy in DataDummy.generateDummymoviesTv()) {
            if (movieTvEntitiy.movieTvId == movieTvId){
                movt = movieTvEntitiy
            }
        }
        return movt
    }

}