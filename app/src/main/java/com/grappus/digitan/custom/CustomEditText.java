package com.grappus.digitan.custom;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatEditText;

import com.grappus.digitan.R;

/**
 * Created by nimish@grappus.com on 22/12/2019.
 * Description - CustomEditText which can set desired font ont he Textview.
 * Use @param customFont in the xml to use it.
 */

public class CustomEditText extends AppCompatEditText {

    private Context context;

    public CustomEditText(Context context) {
        super(context);
        this.context = context;
    }

    public CustomEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        TypedArray tarr = getContext().getTheme().obtainStyledAttributes(attrs,
                R.styleable.CustomFontAppCompatTextView, 0, 0);
        final int N = tarr.getIndexCount();
        for (int i = 0; i < N; ++i) {
            int attr = tarr.getIndex(i);
            if (attr == R.styleable.CustomFontAppCompatTextView_customFont) {
                String fontName = tarr.getString(R.styleable.CustomFontAppCompatTextView_customFont);
                setFont(fontName);
            }
        }
    }

    public CustomEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
        TypedArray tarr = getContext().getTheme().obtainStyledAttributes(attrs,
                R.styleable.CustomFontAppCompatTextView, 0, 0);
        final int N = tarr.getIndexCount();
        for (int i = 0; i < N; ++i) {
            int attr = tarr.getIndex(i);
            if (attr == R.styleable.CustomFontAppCompatTextView_customFont) {
                String fontName = tarr.getString(R.styleable.CustomFontAppCompatTextView_customFont);
                setFont(fontName);
            }
        }
    }

    public void setFont(String fontName) {
        Typeface font = Typeface.createFromAsset(context.getAssets(), "fonts/" + fontName);
        setTypeface(font);
    }
}

