package com.byandev.submisionsatujetpackpro.View.Adapter

import android.annotation.SuppressLint
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.byandev.submisionsatujetpackpro.View.Activity.DetailMovieActivity
import com.byandev.submisionsatujetpackpro.Model.Data.MovieEntity
import com.byandev.submisionsatujetpackpro.R
import kotlinx.android.synthetic.main.items_movie_tv.view.*

class MovieAdapter: RecyclerView.Adapter<MovieAdapter.Holder>(){

    private var lsMovie = ArrayList<MovieEntity>()

    fun setMovie(movie: List<MovieEntity>?) {
        if (movie == null) return
        this.lsMovie.clear()
        this.lsMovie.addAll(movie)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.items_movie_tv, parent, false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val movie = lsMovie[position]
        holder.bind(movie)
    }

    override fun getItemCount(): Int = lsMovie.size


    class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        @SuppressLint("StringFormatInvalid")
        fun bind(movie: MovieEntity){
            with(itemView) {
                tv_item_title.text = movie.title
                tv_item_description.text = movie.description
                tv_item_date.text = movie.thnRilis
                itemView.setOnClickListener{
                    val intent = Intent(itemView.context, DetailMovieActivity::class.java)
                    intent.putExtra(DetailMovieActivity.EXTRA_MOVIE, movie.movieId)
                    itemView.context.startActivity(intent)
                }
                Glide.with(itemView.context)
                    .load(movie.imagePath)
                    .apply(RequestOptions.placeholderOf(R.drawable.ic_loading)
                        .error(R.drawable.ic_error))
                    .centerCrop()
                    .into(image)
            }
        }
    }
}