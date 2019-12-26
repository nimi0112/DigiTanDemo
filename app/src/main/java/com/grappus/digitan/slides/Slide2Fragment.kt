package com.grappus.digitan.slides

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.grappus.digitan.databinding.SlideTwoBinding

/**
 * Created by nimish@grappus.com on 23/12/2019.
 * Description -
 */

class Slide2Fragment : Fragment(), Slide2FragmentHandler {

    private lateinit var binding: SlideTwoBinding

    //Companion object if single instance of fragment is to be maintained
    companion object {
        fun newInstance(args: Bundle?): Slide2Fragment {
            val fragment = Slide2Fragment()
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(
            layoutInflater, com.grappus.digitan.R.layout.slide_two,
            container, false
        )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.run {
            handler = this@Slide2Fragment
        }
    }

    override fun onOutBoxyTimeClicked() {
        binding.etOutboxy.apply {
            setSelection(text!!.length)
            requestFocus()
            showKeyboard()
        }
    }

    override fun onDriftPilotTimeClicked() {
        binding.etDrift.apply {
            setSelection(text!!.length)
            requestFocus()
            showKeyboard()
        }
    }

    override fun onGrappusInternalTimeClicked() {
        binding.etGrappusIntrernal.apply {
            setSelection(text!!.length)
            requestFocus()
            showKeyboard()
        }
    }

    private fun EditText.showKeyboard() {
        val imm: InputMethodManager =
            requireContext().getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.showSoftInput(this, InputMethodManager.SHOW_IMPLICIT)
    }
}

interface Slide2FragmentHandler {
    fun onOutBoxyTimeClicked()
    fun onDriftPilotTimeClicked()
    fun onGrappusInternalTimeClicked()
}