package com.example.nested_fragment_switcher.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.nested_fragment_switcher.R
import com.example.nested_fragment_switcher.databinding.FragmentButtonsBinding

class ButtonsFragment : Fragment() {
    private lateinit var binding: FragmentButtonsBinding
    private var currentFragment: Fragment? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentButtonsBinding.inflate(inflater, container, false)
        val oneFragment = OneFragment()
        val twoFragment = TwoFragment()
        val threeFragment = ThreeFragment()

        binding.buttonOne.setOnClickListener {
            if (currentFragment !is OneFragment) {
                currentFragment = oneFragment
                replaceFragment(oneFragment)
            }
        }

        binding.buttonTwo.setOnClickListener {
            if (currentFragment !is TwoFragment) {
                currentFragment = twoFragment
                replaceFragment(twoFragment)
            }
        }

        binding.buttonThree.setOnClickListener {
            if (currentFragment !is ThreeFragment) {
                currentFragment = threeFragment
                replaceFragment(threeFragment)
            }
        }
        return binding.root
    }

    private fun replaceFragment(fragment: Fragment) {
        parentFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainerView, fragment)
            .addToBackStack(null)
            .commit()
    }
}
