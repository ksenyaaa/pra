package com.example.practice2

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.practice2.databinding.FragmentSettingBinding

class FilmFragment: Fragment(R.layout.fragment_setting) {
    private var binding: FragmentSettingBinding? = null
    private var adapter: FilmAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSettingBinding.bind(view)
        initAdapter()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    private fun initAdapter() {
        adapter = FilmAdapter(FilmRepository.films)

        binding?.run {
            rvFilm.adapter = adapter
            rvFilm.layoutManager= LinearLayoutManager(requireContext())
        }
    }
}