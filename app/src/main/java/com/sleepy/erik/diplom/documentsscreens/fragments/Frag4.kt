package com.sleepy.erik.diplom.documentsscreens.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sleepy.erik.diplom.databinding.FragmentFrag4Binding

class Frag4 : Fragment() {
    private var _binding: FragmentFrag4Binding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFrag4Binding.inflate(inflater, container, false)
        return binding.root
    }
}