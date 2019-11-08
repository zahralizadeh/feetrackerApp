package com.zahra.feetrackerapp.queryprice;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.zahra.feetrackerapp.PublicMethods;
import com.zahra.feetrackerapp.R;
import com.zahra.feetrackerapp.utils.views.myEditText;
import com.zahra.feetrackerapp.utils.views.myTextView;

import java.util.ArrayList;

public class QueryPriceActivity extends AppCompatActivity
        implements QueryPriceContract.View, myTextView.OnClickListener, myTextView.OnLongClickListener {
    private RadioGroup radioOfferTypeGroup;
    private RadioButton radioOfferTypeButton;
    private myEditText age_txt;
    private myEditText rooms_txt;
    private myEditText area_txt;
    private QueryPricePresenter presenter = new QueryPricePresenter();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Initiate views
        super.onCreate(savedInstanceState);
        presenter.attachView(this);
        setContentView(R.layout.activity_query_price);
        radioOfferTypeGroup = findViewById(R.id.radioOffertype);
        final myEditText location_txt = findViewById(R.id.location);
        final myEditText propertytype_txt = findViewById(R.id.property_type);
        age_txt = findViewById(R.id.age);
        rooms_txt = findViewById(R.id.rooms);
        area_txt = findViewById(R.id.area);

        //Define and handle click on GO btn
        myTextView go_btn = findViewById(R.id.go);
        go_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.sendRequest(
                        location_txt.text(), area_txt.text(), age_txt.text(), rooms_txt.text(),
                        selectOffertype(), propertytype_txt.text()
                );
            }
        });


        // Define and set click listener to plus minus btns
        ArrayList<myTextView> btnArr = new ArrayList<>();
        btnArr.add((myTextView) findViewById(R.id.age_plus));
        btnArr.add((myTextView) findViewById(R.id.age_minus));
        btnArr.add((myTextView) findViewById(R.id.room_plus));
        btnArr.add((myTextView) findViewById(R.id.room_minus));
        btnArr.add((myTextView) findViewById(R.id.area_plus));
        btnArr.add((myTextView) findViewById(R.id.area_minus));
        for (myTextView btn : btnArr) {
            btn.setOnClickListener(this);
            btn.setOnLongClickListener(this);
        }
    }

    //Returns which offer-type has been selected
    String selectOffertype() {
        int selectedId = radioOfferTypeGroup.getCheckedRadioButtonId();
        radioOfferTypeButton = (RadioButton) findViewById(selectedId);
        CharSequence offertype = radioOfferTypeButton.getText();
        if (offertype.equals(getString(R.string.radio_rent))) {
            return "2";
        } else if (offertype.equals(getString(R.string.radio_sale))) {
            return "1";
        }
        return "1";
    }

    @Override
    public void showQueryResult(String msg) {
        final AlertDialog msgDialog = new AlertDialog.Builder(this).create();
        msgDialog.setMessage(msg);
        msgDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "GOT IT!", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                msgDialog.dismiss();
            }
        });
        msgDialog.show();
    }

    @Override
    public void showToast(int msg) {
        PublicMethods.showToast(QueryPriceActivity.this, getString(msg));
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.age_plus:
                age_txt.plusNumber();
                break;
            case R.id.age_minus:
                age_txt.minusNumber();
                break;
            case R.id.room_plus:
                rooms_txt.plusNumber();
                break;
            case R.id.room_minus:
                rooms_txt.minusNumber();
                break;
            case R.id.area_plus:
                area_txt.plusNumber();
                break;
            case R.id.area_minus:
                area_txt.minusNumber();
                break;
        }
    }

    @Override
    public boolean onLongClick(View view) {
        switch (view.getId()) {
            case R.id.age_plus:
                age_txt.bigPlusNumber();
                break;
            case R.id.age_minus:
                age_txt.bigMinusNumber();
                break;
            case R.id.room_plus:
                rooms_txt.bigPlusNumber();
                break;
            case R.id.room_minus:
                rooms_txt.bigMinusNumber();
                break;
            case R.id.area_plus:
                area_txt.bigPlusNumber();
                break;
            case R.id.area_minus:
                area_txt.bigMinusNumber();
                break;
        }
        return false;

    }
}
