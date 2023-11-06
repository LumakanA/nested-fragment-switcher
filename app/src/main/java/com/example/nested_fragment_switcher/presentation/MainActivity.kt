package com.example.nested_fragment_switcher.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import com.example.nested_fragment_switcher.R
import com.example.nested_fragment_switcher.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState == null) {
            supportFragmentManager.commit {
                val firstFragment = OneFragment()
                val buttonsFragment = ButtonsFragment()
                setReorderingAllowed(true)
                add(R.id.fragmentContainerView, firstFragment)
                add(R.id.buttonsFragmentContainerView, buttonsFragment)
            }
        }
    }
}
