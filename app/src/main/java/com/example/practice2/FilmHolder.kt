package com.example.practice2

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.practice2.databinding.ItemFilmBinding

class FilmHolder(private val bilding: ItemFilmBinding, private val glide: RequestManager): ViewHolder(bilding.root) {
    fun onBind(film: Film){
        bilding.run {
            tvFilm.text = film.name
            tvTypes.text = film.types

            Glide.with(itemView.context)
                .load(film.url)
                .into(ivImage)
        }
    }
}