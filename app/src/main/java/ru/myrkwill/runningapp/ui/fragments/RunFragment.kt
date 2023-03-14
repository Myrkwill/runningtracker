package ru.myrkwill.runningapp.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import ru.myrkwill.runningapp.databinding.FragmentRunBinding
import ru.myrkwill.runningapp.ui.viewModels.MainViewModel

@AndroidEntryPoint
class RunFragment : Fragment() {

    private val viewModel: MainViewModel by viewModels()

    private lateinit var binding: FragmentRunBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRunBinding.inflate(layoutInflater, container, false)
        return binding.root
    }


}