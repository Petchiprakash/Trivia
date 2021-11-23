package com.example.trivia

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.trivia.databinding.FragmentQuizActivityBinding

class QuizActivity : Fragment() {
    private var tempbinding: FragmentQuizActivityBinding? = null
    private val binding get() = tempbinding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        tempbinding = FragmentQuizActivityBinding.inflate(layoutInflater,container,false)
        binding.btnSubmit.setOnClickListener{
            when(true){
                binding.rbChoose1.isChecked -> Toast.makeText(activity,"Correct Answer",Toast.LENGTH_LONG).show()
                binding.rbChoose2.isChecked -> Toast.makeText(activity,"Wrong Answer",Toast.LENGTH_LONG).show()
                binding.rbChoose3.isChecked -> Toast.makeText(activity,"Wrong Answer",Toast.LENGTH_LONG).show()
                binding.rbChoose4.isChecked -> Toast.makeText(activity,"Wrong Answer",Toast.LENGTH_LONG).show()
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