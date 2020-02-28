package com.byandev.submisionsatujetpackpro.ViewModel

import androidx.lifecycle.ViewModel
import com.byandev.submisionsatujetpackpro.Model.Data.MovieEntity
import com.byandev.submisionsatujetpackpro.Model.Utils.DataDummy

class MovieViewModel : ViewModel() {
    fun getMovie(): List<MovieEntity> = DataDummy.generateDummymovies()
}
