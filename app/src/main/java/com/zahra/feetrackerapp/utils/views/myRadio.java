package com.zahra.feetrackerapp.utils.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RadioButton;

import com.zahra.feetrackerapp.MyApplication;

public class myRadio extends RadioButton {

    public myRadio(Context context) {
        super(context);
        init();
    }

    public myRadio(Context context, AttributeSet attrs) {
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
