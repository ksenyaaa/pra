package com.example.practice2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager
import com.example.practice2.databinding.ItemFilmBinding

class FilmAdapter(private val list: List<Film>, private val glide: RequestManager, private val onClick: (Film) -> Unit): RecyclerView.Adapter<FilmHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): FilmHolder = FilmHolder(
        bilding = ItemFilmBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        ),
        glide = glide,
        onClick = onClick
    )

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: FilmHolder, position: Int) {
        holder.onBind(list[position])
    }

}