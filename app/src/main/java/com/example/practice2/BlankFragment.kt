package com.example.practice2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.practice2.databinding.FragmentBlankBinding


class BlankFragment : Fragment(R.layout.fragment_blank) {
    private var binding: FragmentBlankBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentBlankBinding.bind(view)

        binding?.run {

        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        binding = null

    }

}

