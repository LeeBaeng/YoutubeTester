package com.leebaeng.youtubetester.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class VideoListPageAdapter(fa: FragmentActivity, val pageList: ArrayList<*>): FragmentStateAdapter(fa) {
    override fun getItemCount(): Int = pageList.size

    override fun createFragment(position: Int): Fragment {
        return VideoListFragment()
    }
}