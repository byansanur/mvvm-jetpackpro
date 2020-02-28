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
import com.byandev.submisionsatujetpackpro.Model.Data.MovieTvEntity
import com.byandev.submisionsatujetpackpro.R
import kotlinx.android.synthetic.main.items_movie_tv.view.*

class MovieTvAdapter: RecyclerView.Adapter<MovieTvAdapter.Holder>(){

    private var lstvmovie = ArrayList<MovieTvEntity>()

    fun setMovieTv(mt: List<MovieTvEntity>?) {
        if (mt == null) return
        this.lstvmovie.clear()
        this.lstvmovie.addAll(mt)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.items_movie_tv, parent, false)
        return Holder(view)
    }

    override fun getItemCount(): Int = lstvmovie.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val movieTv = lstvmovie[position]
        holder.bind(movieTv)
    }

    class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        @SuppressLint("StringFormatInvalid")
        fun bind(movieTv: MovieTvEntity){
            with(itemView) {
                tv_item_title.text = movieTv.title
                tv_item_description.text = movieTv.description
                tv_item_date.text = movieTv.thnRilis
                itemView.setOnClickListener{
                    val intent = Intent(itemView.context, DetailMovieActivity::class.java)
                    intent.putExtra(DetailMovieActivity.EXTRA_MOVIE_TV, movieTv.movieTvId)
                    itemView.context.startActivity(intent)
                }
                Glide.with(itemView.context)
                    .load(movieTv.imagePath)
                    .apply(
                        RequestOptions.placeholderOf(R.drawable.ic_loading)
                            .error(R.drawable.ic_error))
                    .centerCrop()
                    .into(image)
            }
        }
    }

}