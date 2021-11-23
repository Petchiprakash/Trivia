package com.example.trivia

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.trivia.databinding.FragmentQuizActivityBinding

class QuizFragment : Fragment() {
    private var tempbinding: FragmentQuizActivityBinding? = null
    private val binding get() = tempbinding!!
    private lateinit var onTap: OnTap
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        tempbinding = FragmentQuizActivityBinding.inflate(layoutInflater,container,false)
        onTap = activity as OnTap
        binding.btnSubmit.setOnClickListener{
            when(true){
                binding.rbChoose1.isChecked -> onTap.tapQuiz("Correct Answer")
                binding.rbChoose2.isChecked -> onTap.tapQuiz("Wrong Answer")
                binding.rbChoose3.isChecked -> onTap.tapQuiz("Wrong Answer")
                binding.rbChoose4.isChecked -> onTap.tapQuiz("Wrong Answer")
                else -> {Toast.makeText(activity,"Please select option",Toast.LENGTH_LONG).show()}
            }
        }
        return binding.root
    }
    override fun onDestroy() {
        super.onDestroy()
        tempbinding = null
    }

}