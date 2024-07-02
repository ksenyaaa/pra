package com.example.practice2

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.practice2.databinding.FragmentBlankBinding
import com.example.practice2.databinding.FragmentSettingBinding

class setting_fragment: Fragment(R.layout.fragment_setting) {
    private var binding: FragmentSettingBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSettingBinding.bind(view)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}