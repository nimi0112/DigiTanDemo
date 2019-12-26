package com.grappus.digitan.custom

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView
import com.grappus.digitan.R

/**
 * Created by nimish@grappus.com on 22/12/2019.
 * Description - CustomTextView which can set desired font ont he Textview.
 * Use @param customFont in the xml to use it.
 */

class CustomTextView : AppCompatTextView {

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        val tarr = getContext().theme.obtainStyledAttributes(attrs,
            R.styleable.CustomFontAppCompatTextView, 0, 0)
        val N = tarr.indexCount
        for (i in 0 until N) {
            val attr = tarr.getIndex(i)
            if (attr == R.styleable.CustomFontAppCompatTextView_customFont) {
                val fontName = tarr.getString(R.styleable.CustomFontAppCompatTextView_customFont)
                setFont(fontName)
            }
        }
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        val tarr = getContext().theme.obtainStyledAttributes(attrs,
            R.styleable.CustomFontAppCompatTextView, 0, 0)
        val N = tarr.indexCount
        for (i in 0 until N) {
            val attr = tarr.getIndex(i)
            if (attr == R.styleable.CustomFontAppCompatTextView_customFont) {
                val fontName = tarr.getString(R.styleable.CustomFontAppCompatTextView_customFont)
                setFont(fontName)
            }
        }
    }

    fun setFont(fontName: String?) {
        val font = Typeface.createFromAsset(context!!.assets, "fonts/" + fontName!!)
        typeface = font
    }
}
