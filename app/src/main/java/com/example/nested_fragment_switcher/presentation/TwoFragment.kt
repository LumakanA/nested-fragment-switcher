package com.example.nested_fragment_switcher.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.nested_fragment_switcher.databinding.FragmentTwoBinding

class TwoFragment : Fragment() {
    private lateinit var binding: FragmentTwoBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTwoBinding.inflate(inflater, container, false)

        return binding.root
    }
}