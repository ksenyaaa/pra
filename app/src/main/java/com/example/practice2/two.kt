package com.example.practice2

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.practice2.databinding.FragmentSettingBinding
import com.example.practice2.databinding.FragmentTwoBinding

class two : Fragment(R.layout.fragment_two) {
    private var binding: FragmentTwoBinding? = null


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentTwoBinding.bind(view)
        binding?.run{
            etEditText.setOnClickListener {
                val text = etEmail.text.toString
                val bundle = Bundle()
                bundle.putString("ARG_EMAIL", text)
                findNavController().navigate(R.id.action_two_to_blankFragment, args = bundle)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}