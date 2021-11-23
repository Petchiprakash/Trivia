package com.example.trivia

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.trivia.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),OnTap {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val firstFragment = OpeningFragment()
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, firstFragment).commit()
        }
    }

    override fun tapOpening() {
        val transaction = this.supportFragmentManager.beginTransaction()
        val secondFragment = QuizFragment()
        transaction.replace(R.id.flFragment,secondFragment)
        transaction.commit()
    }

    override fun tapQuiz(result: String) {
        val bundle = Bundle()
        bundle.putString("message",result)
        val transaction = this.supportFragmentManager.beginTransaction()
        val thirdFragment = ResultFragment()
        thirdFragment.arguments = bundle
        transaction.replace(R.id.flFragment,thirdFragment)
        transaction.commit()
    }

    override fun tapResult() {
        val transaction = this.supportFragmentManager.beginTransaction()
        val firstFragment = OpeningFragment()
        transaction.replace(R.id.flFragment,firstFragment)
        transaction.commit()

    }
}