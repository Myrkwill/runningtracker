package ru.myrkwill.runningapp.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import ru.myrkwill.runningapp.databinding.FragmentTrackingBinding
import ru.myrkwill.runningapp.ui.viewModels.MainViewModel

@AndroidEntryPoint
class TrackingFragment : Fragment() {

    private val viewModel: MainViewModel by viewModels()

    private lateinit var binding: FragmentTrackingBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTrackingBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

}