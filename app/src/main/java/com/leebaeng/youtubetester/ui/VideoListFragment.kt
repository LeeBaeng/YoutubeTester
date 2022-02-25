package com.leebaeng.youtubetester.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.leebaeng.youtubetester.databinding.FragmentVideolistBinding

class VideoListFragment : Fragment() {
    lateinit var binding: FragmentVideolistBinding
        private set

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentVideolistBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    }
}