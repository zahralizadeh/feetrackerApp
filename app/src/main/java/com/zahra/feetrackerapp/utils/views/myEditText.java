package com.zahra.feetrackerapp.utils.views;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import com.zahra.feetrackerapp.MyApplication;

import androidx.appcompat.widget.AppCompatEditText;

public class myEditText extends AppCompatEditText {

    public myEditText(Context context) {
        super(context);
        init();
    }

    public myEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public String text() {
        return this.getText().toString();
    }

    public void plusNumber() {
        int n =  Integer.parseInt(this.text());
        n = n + 1;
        String result = n + "";
        this.setText(result);
    }

    public void minusNumber() {
        int n = Integer.parseInt(this.text());
        n = n - 1;
        if (n< 0) n = 0;
        String result = n + "";
        this.setText(result);
    }public void bigPlusNumber() {
        int n =  Integer.parseInt(this.text());
        n = n + 10;
        String result = n + "";
        this.setText(result);
    }

    public void bigMinusNumber() {
        int n = Integer.parseInt(this.text());
        n = n - 10;
        if (n< 0) n = 0;
        String result = n + "";
        this.setText(result);
    }

    private void init() {
        if (!isInEditMode()) {
            this.setTypeface(MyApplication.appFace_light);
        }
    }
}
