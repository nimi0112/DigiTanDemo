package com.grappus.digitan

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.grappus.digitan.slides.Slide1Fragment
import com.grappus.digitan.slides.Slide2Fragment
import com.grappus.digitan.slides.Slide3Fragment

/**
 * Created by nimish@grappus.com on 22/12/2019.
 * Description -
 */

class SlidesAdapter(fm: FragmentManager) :
    FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> Slide1Fragment.newInstance(null)
            1 -> Slide2Fragment.newInstance(null)
            2 -> Slide3Fragment.newInstance(null)
            else -> throw IllegalStateException("Unknown position")
        }
    }

    override fun getCount() = 3

}