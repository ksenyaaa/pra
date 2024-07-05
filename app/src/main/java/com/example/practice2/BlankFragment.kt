package com.example.practice2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.practice2.databinding.FragmentBlankBinding


class BlankFragment : Fragment(R.layout.fragment_blank) {
    private var binding: FragmentBlankBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentBlankBinding.bind(view)

        val filmId = arguments?.getInt("KEY") ?: 0
        val film = FilmRepository.getFilmById(filmId)
        binding?.run {
            Glide.with(this)
                .load(film.url)
                .centerCrop()
                .into(ivPoster)
            tvFilmName.text = film.name
            tvFilmTypes.text = film.types
            tvFilmDescription.text = film.description


        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null

    }
    companion object {
        private const val ARG_ID = "ARG_ID"

        fun newInstance(arg: String): Bundle = Bundle().apply {
            putString(ARG_ID, arg)
        }
    }

}

