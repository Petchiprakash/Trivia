package com.example.trivia

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.trivia.databinding.FragmentResultBinding

class ResultFragment : Fragment() {
    private lateinit var binding: FragmentResultBinding
    private lateinit var onTap: OnTap
    private var displayMessage:String? = ""
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding =FragmentResultBinding.inflate(inflater,container,false)
        onTap = activity as OnTap
        displayMessage = arguments?.getString("message")
        binding.tvDisplay.text = displayMessage
        binding.btnPlayAgain.setOnClickListener{
            onTap.tapResult()
        }
        return binding.root
    }
}