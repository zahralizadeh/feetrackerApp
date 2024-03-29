package com.zahra.feetrackerapp;

import com.zahra.feetrackerapp.utils.RetrofitServiceGenerator;
import com.zahra.feetrackerapp.utils.WebInterface;

public class Constants {
    public static final String API_BASE_URL = "http://10.0.2.2:8003/";
    public static WebInterface webInterface = RetrofitServiceGenerator.createService(WebInterface.class);
    public static final String light_font = "fonts/ir_sans.ttf";
    public static final String regular_font = "fonts/Haftad.ttf";

}
