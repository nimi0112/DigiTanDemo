package com.grappus.digitan.slides

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.grappus.digitan.R
import com.grappus.digitan.SlidesBindingModel
import com.grappus.digitan.databinding.SlideOneBinding

/**
 * Created by nimish@grappus.com on 22/12/2019.
 * Description -
 */

class Slide1Fragment() : Fragment(), Slide1FragmentHandler {

    private lateinit var binding: SlideOneBinding
    private val bindingModel = SlidesBindingModel()

    //Companion object if single instance of fragment is to be maintained
    companion object {
        fun newInstance(args: Bundle?): Slide1Fragment {
            val fragment = Slide1Fragment()
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        //return inflater.inflate(R.layout.slide_one, container, false)

        binding = DataBindingUtil.inflate(
            layoutInflater, R.layout.slide_one,
            container, false
        )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.run {
            handler = this@Slide1Fragment
            data = bindingModel
        }
    }

    override fun adjustOutBoxyTime(increase: Boolean) {
        bindingModel.run {
            if (increase) {
                currentOutBoxyTime++
            } else {
                currentOutBoxyTime--
            }
        }
    }

    override fun adjustDriftPilotTime(increase: Boolean) {
        bindingModel.run {
            if (increase) {
                currentDriftPilotTime++
            } else {
                currentDriftPilotTime--

            }
        }
    }

    override fun adjustGrappusInternalTime(increase: Boolean) {
        bindingModel.run {
            if (increase) {
                currentGrappusInternalTime++
            } else {
                currentGrappusInternalTime--
            }
        }
    }
}

interface Slide1FragmentHandler {
    fun adjustOutBoxyTime(increase: Boolean)
    fun adjustDriftPilotTime(increase: Boolean)
    fun adjustGrappusInternalTime(increase: Boolean)
}