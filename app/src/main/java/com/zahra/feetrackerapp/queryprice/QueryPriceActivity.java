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

public class QueryPriceActivity extends AppCompatActivity implements QueryPriceContract.View {
    private RadioGroup radioOfferTypeGroup;
    private RadioButton radioOfferTypeButton;
    private QueryPricePresenter presenter = new QueryPricePresenter();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter.attachView(this);
        setContentView(R.layout.activity_query_price);
        radioOfferTypeGroup = findViewById(R.id.radioOffertype);
        final myEditText location_txt = findViewById(R.id.location);
        final myEditText propertytype_txt = findViewById(R.id.property_type);
        final myEditText age_txt = findViewById(R.id.age);
        final myEditText rooms_txt = findViewById(R.id.rooms);
        final myEditText area_txt = findViewById(R.id.area);
        myTextView go_btn = findViewById(R.id.go);
        go_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.sendRequest(
                        location_txt.text(),area_txt.text(),age_txt.text(),rooms_txt.text(),
                        selectOffertype(),propertytype_txt.text()
                        );
            }
        });

    }

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
}
