package com.example.practice2

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.example.practice2.databinding.FragmentSettingBinding
import com.google.android.material.snackbar.Snackbar

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
        binding?.run {
            adapter = FilmAdapter(
                list = FilmRepository.films,
                glide = (Glide.with(this@FilmFragment)),
                onClick = {
                    val bundle = Bundle().apply {
                        putInt("KEY", it.id)
                    }
                    findNavController().navigate(R.id.action_setting_fragment_to_blankFragment, bundle)


                }

            )

        rvFilm.adapter = adapter
        rvFilm.layoutManager = LinearLayoutManager(requireContext())

        }
    }
}