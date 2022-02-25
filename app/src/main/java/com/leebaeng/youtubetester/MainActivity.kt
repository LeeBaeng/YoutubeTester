package com.leebaeng.youtubetester

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import com.google.android.material.tabs.TabLayoutMediator
import com.leebaeng.youtubetester.databinding.ActivityMainBinding
import com.leebaeng.youtubetester.ui.VideoListPageAdapter

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
        private set

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.viewpager.apply {
            // TODO : VideoPageData 생성 및 LiveData 적용
            adapter = VideoListPageAdapter(context as FragmentActivity, ArrayList<Any>())
        }

        TabLayoutMediator(binding.tabs, binding.viewpager) { tab, position ->
            // TODO : VideoPagerData 참조하여 타이틀 및 아이콘 설정
            tab.text = "탭 $position"
//            tab.setIcon(R.drawable.ic_baseline_map_24)
        }.attach()
    }
}