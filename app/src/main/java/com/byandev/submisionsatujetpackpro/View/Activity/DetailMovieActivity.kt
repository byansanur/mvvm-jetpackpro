package com.byandev.submisionsatujetpackpro.View.Activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.byandev.submisionsatujetpackpro.ViewModel.DetailViewModel
import com.byandev.submisionsatujetpackpro.Model.Data.MovieEntity
import com.byandev.submisionsatujetpackpro.Model.Data.MovieTvEntity
import com.byandev.submisionsatujetpackpro.R

import kotlinx.android.synthetic.main.activity_detail_movie.*
import kotlinx.android.synthetic.main.content_detail.*

class DetailMovieActivity : AppCompatActivity() {

    companion object{
        const val EXTRA_MOVIE = "extra_movie"
        const val EXTRA_MOVIE_TV = "extra_movie_tv"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_movie)
        setSupportActionBar(toolbar)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[DetailViewModel::class.java]
        val extras = intent.extras
        when {
            extras != null -> {
                val movieId = extras.getString(EXTRA_MOVIE)
                val movieTvId = extras.getString(EXTRA_MOVIE_TV)
                when {
                    movieId != null -> {
                        viewModel.setSelectedMovie(movieId)
                        populateMovie(viewModel.getMovie()!!)
                        supportActionBar?.title = "Detail Movie"
                    }
                    movieTvId != null -> {
                        viewModel.setSelectedMovieTv(movieTvId)
                        populateMovieTv(viewModel.getMovieTv()!!)
                        supportActionBar?.title = "Detail Serial TV"
                    }
                }
            }
        }
    }

    private fun populateMovieTv(mt: MovieTvEntity) {
        tvTitle.text = mt.title
        tvPenulis.text = mt.penulis
        tvRilis.text = mt.thnRilis
        tvPh.text = mt.ph
        tvDesc.text = mt.description
        tvProducer.text = mt.producer
        tvSutradara.text = mt.sutradara
        Glide.with(this)
            .load(mt.imagePath)
            .apply(RequestOptions.placeholderOf(R.drawable.ic_loading)
                .error(R.drawable.ic_error))
            .into(image_poster)

    }

    private fun populateMovie(mv: MovieEntity) {
        tvTitle.text = mv.title
        tvPenulis.text = mv.penulis
        tvRilis.text = mv.thnRilis
        tvPh.text = mv.ph
        tvDesc.text = mv.description
        tvProducer.text = mv.producer
        tvSutradara.text = mv.sutradara
        Glide.with(this)
            .load(mv.imagePath)
            .apply(RequestOptions.placeholderOf(R.drawable.ic_loading)
                .error(R.drawable.ic_error))
            .into(image_poster)
    }

}
