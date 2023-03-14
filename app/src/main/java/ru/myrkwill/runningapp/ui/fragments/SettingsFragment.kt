package ru.myrkwill.runningapp.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import ru.myrkwill.runningapp.R
import ru.myrkwill.runningapp.ui.viewModels.MainViewModel

@AndroidEntryPoint
class SettingFragment : Fragment(R.layout.fragment_settings) {

    private val viewModel: MainViewModel by viewModels()

}