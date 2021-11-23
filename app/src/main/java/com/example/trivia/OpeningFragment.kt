package com.example.trivia

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.trivia.databinding.FragmentOpeningBinding


class OpeningFragment : Fragment() {
    private lateinit var binding: FragmentOpeningBinding
    private lateinit var onTap: OnTap
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOpeningBinding.inflate(inflater,container,false)
        onTap = activity as OnTap
        binding.btnPlay.setOnClickListener{
            onTap.tapOpening()
        }
        return binding.root
    }

}