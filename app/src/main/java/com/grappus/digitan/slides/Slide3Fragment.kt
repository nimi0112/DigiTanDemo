package com.grappus.digitan.slides

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.grappus.digitan.R
import com.grappus.digitan.Slide3BindingModel
import com.grappus.digitan.databinding.SlideThreeBinding

/**
 * Created by nimish@grappus.com on 22/12/2019.
 * Description -
 */

class Slide3Fragment : Fragment() {

    private lateinit var bindingModel: Slide3BindingModel
    private lateinit var binding: SlideThreeBinding

    //Companion object if single instance of fragment is to be maintained
    companion object {
        fun newInstance(args: Bundle?): Slide3Fragment {
            val fragment = Slide3Fragment()
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            layoutInflater, R.layout.slide_three,
            container, false
        )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.run {
            bindingModel = Slide3BindingModel(
                outBoxySeekBar = outboxySeekbar,
                driftPilotSeekBar = driftPilotSeekbar,
                grappusInternalSeekBar = grappusInternalSeekbar
            )

            data=bindingModel
        }
    }
}