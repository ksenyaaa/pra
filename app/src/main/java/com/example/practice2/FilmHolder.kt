package com.example.practice2

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.example.practice2.databinding.ItemFilmBinding

class FilmHolder(private val bilding: ItemFilmBinding, private val glide: RequestManager, private val onClick: (Film) -> Unit,): ViewHolder(bilding.root) {

    fun onBind(film: Film){
        bilding.run {
            tvFilm.text = film.name
            tvTypes.text = film.types

            glide
                .load(film.url)
                .into(ivImage)

            root.setOnClickListener{
                onClick.invoke(film)

            }
        }
    }
}