package com.example.mars.screen.root

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.allViews
import androidx.fragment.app.FragmentActivity
import com.example.mars.R
import com.example.mars.ViewPagerAdapter
import com.example.mars.databinding.FragmentRootBinding
import com.google.android.material.tabs.TabLayoutMediator


class RootFragment : Fragment() {
    private var _binding: FragmentRootBinding? = null
    // This property is only valid between onCreateView and
// onDestroyView.
    private var ctx: Context? = null
    private val binding get() = _binding!!

    override fun onAttach(context: Context) {
        super.onAttach(context)

        ctx = context
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentRootBinding.inflate(layoutInflater)
        binding.tabLayout.tabIconTint = null
        binding.viewPager.adapter = ViewPagerAdapter(ctx as FragmentActivity)
        TabLayoutMediator(binding.tabLayout, binding.viewPager) {
            tab, pos ->
            when(pos) {
                0 -> {
                    tab.setIcon(R.drawable.ic_money)
                }
                1 -> {
                    tab.setIcon(R.drawable.ic_notmoney)
                }
            }
        }.attach()
        return binding.root
    }


}