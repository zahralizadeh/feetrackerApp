package com.zahra.feetrackerapp.utils.views;

import android.content.Context;
import android.util.AttributeSet;

import com.zahra.feetrackerapp.MyApplication;

import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.TextViewCompat;

public class myRegularText extends AppCompatTextView {

    public myRegularText(Context context) {
        super(context);
        init();
    }

    public myRegularText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            this.setTypeface(MyApplication.appFace_regular);
        }
    }
}
