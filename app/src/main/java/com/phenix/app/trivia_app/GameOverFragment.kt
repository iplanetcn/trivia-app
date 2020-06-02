package com.phenix.app.trivia_app

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.phenix.app.trivia_app.databinding.FragmentGameOverBinding

class GameOverFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentGameOverBinding.inflate(inflater, container, false)
        binding.tryAgainButton.setOnClickListener { v ->
            Navigation.findNavController(v).navigate(R.id.action_gameOverFragment_to_gameFragment)
        }

        return binding.root
    }

}