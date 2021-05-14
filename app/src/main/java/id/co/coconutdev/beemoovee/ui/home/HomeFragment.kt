package id.co.coconutdev.beemoovee.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import id.co.coconutdev.beemoovee.SectionsPagerAdapter
import id.co.coconutdev.beemoovee.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var fragmentHomeBinding: FragmentHomeBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        fragmentHomeBinding = FragmentHomeBinding.inflate(layoutInflater, container, false)
        return fragmentHomeBinding.root;


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if(activity!=null){
            val sectionsPagerAdapter = SectionsPagerAdapter(requireContext(), childFragmentManager)
            fragmentHomeBinding.homeViewPager.adapter = sectionsPagerAdapter
            fragmentHomeBinding.homeTabLayout.setupWithViewPager(fragmentHomeBinding.homeViewPager)

            fragmentHomeBinding.homeTabLayout.isTabIndicatorFullWidth = false
        }
    }


}