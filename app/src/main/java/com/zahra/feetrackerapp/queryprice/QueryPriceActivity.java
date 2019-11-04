package com.zahra.feetrackerapp.queryprice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.zahra.feetrackerapp.R;

public class QueryPriceActivity extends AppCompatActivity {
    private RadioGroup radioOfferTypeGroup;
    private RadioButton radioOfferTypeButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_query_price);
        radioOfferTypeGroup = findViewById(R.id.radioOffertype);

    }

    int selectOffertype() {
        int selectedId = radioOfferTypeGroup.getCheckedRadioButtonId();
        radioOfferTypeButton = (RadioButton) findViewById(selectedId);
        CharSequence offertype = radioOfferTypeButton.getText();
        if (offertype.equals(R.string.radio_rent)) {
            return 2;
        } else if (offertype.equals(R.string.radio_sale)) {
            return 1;
        }
        return 1;
    }
}
