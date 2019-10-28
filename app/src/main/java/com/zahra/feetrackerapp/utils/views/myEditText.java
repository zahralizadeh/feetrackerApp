package com.zahra.feetrackerapp.utils.views;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import com.zahra.feetrackerapp.MyApplication;

import androidx.appcompat.widget.AppCompatEditText;

public class myEditText extends AppCompatEditText {

    public myEditText(Context context) {
        super(context);
    }

    public myEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public String text() {
        return this.getText().toString();
    }

    private void init() {
        if (!isInEditMode()) {
           // Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "Lato-Light.ttf");
            //setTypeface(tf);
            this.setTypeface(MyApplication.appFace_light);
        }
    }
}
