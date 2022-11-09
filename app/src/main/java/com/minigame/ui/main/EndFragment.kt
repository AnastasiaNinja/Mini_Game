package com.minigame.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.minigame.Game
import com.minigame.R
import com.minigame.databinding.FragmentEndBinding
import kotlin.system.exitProcess

class EndFragment : Fragment() {

    lateinit var binding : FragmentEndBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentEndBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.end.setOnClickListener { exitProcess(0)}

        val textView = requireView().findViewById<TextView>(R.id.message)
        textView.text = Game.endTitle
    }

}