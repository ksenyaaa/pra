package com.example.practice2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.practice2.databinding.ItemFilmBinding

class FilmAdapter(private val list: List<Film>): RecyclerView.Adapter<FilmHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): FilmHolder = FilmHolder(
        ItemFilmBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
    )

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: FilmHolder, position: Int) {
        holder.onBind(list[position])
    }

}