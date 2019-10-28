package com.zahra.feetrackerapp;

import com.zahra.feetrackerapp.utils.RetrofitServiceGenerator;
import com.zahra.feetrackerapp.utils.WebInterface;

public class Constants {
    public static WebInterface webInterface = RetrofitServiceGenerator.createService(WebInterface.class);
    public static final String light_font = "fonts/Lato-Light.ttf";
    public static final String regular_font = "fonts/Lato-Regular.ttf";

}
