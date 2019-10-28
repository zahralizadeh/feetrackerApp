package com.zahra.feetrackerapp.utils.views;

import android.content.Context;
import android.util.AttributeSet;

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
}
