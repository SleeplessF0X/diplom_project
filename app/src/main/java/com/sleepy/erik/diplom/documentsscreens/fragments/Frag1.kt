package com.sleepy.erik.diplom.documentsscreens.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sleepy.erik.diplom.databinding.FragmentFrag1Binding

class Frag1 : Fragment() {
    private var _binding: FragmentFrag1Binding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFrag1Binding.inflate(inflater, container, false)
        return binding.root
    }
}