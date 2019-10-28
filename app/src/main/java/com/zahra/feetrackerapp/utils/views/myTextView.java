package com.zahra.feetrackerapp.utils.views;

import android.content.Context;
import android.util.AttributeSet;

import com.zahra.feetrackerapp.MyApplication;

import androidx.appcompat.widget.AppCompatTextView;

public class myTextView extends AppCompatTextView {

    public myTextView(Context context) {
        super(context);
        init();
    }

    public myTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            // Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "Lato-Light.ttf");
            //setTypeface(tf);
            this.setTypeface(MyApplication.appFace_light);
        }
    }
}
