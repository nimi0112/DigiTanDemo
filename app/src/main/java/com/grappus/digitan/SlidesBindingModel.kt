package com.grappus.digitan

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

/**
 * Created by nimish@grappus.com on 22/12/2019.
 * Description -
 */

class SlidesBindingModel : BaseObservable() {

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

}