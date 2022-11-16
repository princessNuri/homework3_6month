package com.example.homework3_6month.ui.firstFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.homework3_6month.databinding.FragmentFirstBinding
import com.example.homework3_6month.ui.MainViewModel


class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(requireActivity())[MainViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentFirstBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding){
            btnIncrease.setOnClickListener {
                viewModel.increase()
            }
            btnDecrease.setOnClickListener {
                viewModel.decrease()
            }
        }
    }


}