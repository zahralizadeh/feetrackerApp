package com.zahra.feetrackerapp.utils.views;

import android.content.Context;
import android.util.AttributeSet;

import com.zahra.feetrackerapp.MyApplication;

import androidx.appcompat.widget.AppCompatButton;

public class myButton extends AppCompatButton {
    public myButton(Context context) {
        super(context);
        init();
    }

    public myButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }
    private void init(){
        this.setTypeface(MyApplication.appFace_light);
    }
}
