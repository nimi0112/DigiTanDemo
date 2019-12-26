package com.grappus.digitan

import android.widget.SeekBar
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

/**
 * Created by nimish@grappus.com on 22/12/2019.
 * Description -
 */

class Slide3BindingModel(
    outBoxySeekBar: SeekBar,
    driftPilotSeekBar: SeekBar,
    grappusInternalSeekBar: SeekBar
) : BaseObservable() {

    init {
        outBoxySeekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                currentOutBoxyTime = progress
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
            }

        }
        )

        driftPilotSeekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                currentDriftPilotTime = progress
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
            }

        }
        )

        grappusInternalSeekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                currentGrappusInternalTime = progress
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
            }

        }
        )
    }

    @get:Bindable
    var currentOutBoxyTime: Int = 2
        set(value) {
            field = value
            notifyPropertyChanged(BR.currentOutBoxyTime)
        }

    @get:Bindable
    var currentDriftPilotTime: Int = 2
        set(value) {
            field = value
            notifyPropertyChanged(BR.currentDriftPilotTime)
        }

    @get:Bindable
    var currentGrappusInternalTime: Int = 2
        set(value) {
            field = value
            notifyPropertyChanged(BR.currentGrappusInternalTime)
        }

    @get:Bindable("currentOutBoxyTime")
    val currentOutBoxyTimeText: String
        get() = currentOutBoxyTime.toString() + "h"

    @get:Bindable("currentDriftPilotTime")
    val currentDriftPilotTimeText: String
        get() = currentDriftPilotTime.toString() + "h"

    @get:Bindable("currentGrappusInternalTime")
    val currentGrappusInternalTimeText: String
        get() = currentGrappusInternalTime.toString() + "h"

}