package com.example.practice2

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.practice2.databinding.FragmentTwoBinding
import com.google.android.material.snackbar.Snackbar

class TwoFragment : Fragment(R.layout.fragment_two) {
    private var binding: FragmentTwoBinding? = null


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentTwoBinding.bind(view)
        binding?.run{
            btnSend.setOnClickListener {
                val text = et.text.toString()
                if (text.isEmpty()) {
                    Snackbar
                        .make(requireView(), "Can't be empty", Snackbar.LENGTH_SHORT)
                        .show()
                } else {
                    findNavController().navigate(
                        R.id.action_two_to_blankFragment,
                        BlankFragment.newInstance(text)
                    )
                }
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}