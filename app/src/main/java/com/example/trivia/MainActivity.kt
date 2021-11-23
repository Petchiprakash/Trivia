package com.example.trivia

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.trivia.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val firstFragment = OpeningFragment()
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment,firstFragment).commit()
        }

    }
}