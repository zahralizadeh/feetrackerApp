package com.zahra.feetrackerapp.utils.views;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import com.zahra.feetrackerapp.MyApplication;

import androidx.appcompat.widget.AppCompatEditText;

public class myEditText extends AppCompatEditText {

    public myEditText(Context context) {
        super(context); init();
    }

    public myEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public String text() {
        return this.getText().toString();
    }

    private void init() {
        if (!isInEditMode()) {
            this.setTypeface(MyApplication.appFace_light);
        }
    }
}
