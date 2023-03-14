package ru.myrkwill.runningapp.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import ru.myrkwill.runningapp.databinding.FragmentStatisticsBinding
import ru.myrkwill.runningapp.ui.viewModels.StatisticsViewModel

@AndroidEntryPoint
class StatisticsFragment : Fragment() {

    private val viewModel: StatisticsViewModel by viewModels()

    private lateinit var binding: FragmentStatisticsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentStatisticsBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

}