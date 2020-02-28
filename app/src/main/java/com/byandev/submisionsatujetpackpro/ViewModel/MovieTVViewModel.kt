package com.byandev.submisionsatujetpackpro.ViewModel

import androidx.lifecycle.ViewModel
import com.byandev.submisionsatujetpackpro.Model.Data.MovieTvEntity
import com.byandev.submisionsatujetpackpro.Model.Utils.DataDummy

class MovieTVViewModel : ViewModel() {
    fun getMovieTv(): List<MovieTvEntity> = DataDummy.generateDummymoviesTv()
}
