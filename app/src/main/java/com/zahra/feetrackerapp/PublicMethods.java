package com.zahra.feetrackerapp;

import android.content.Context;
import android.widget.Toast;

public class PublicMethods {
    public static  void showToast (Context mContext,String msg){
        Toast.makeText(mContext,msg,Toast.LENGTH_LONG).show();
    }
}
