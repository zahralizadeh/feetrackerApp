package com.zahra.feetrackerapp.Register;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.TextView;

import com.zahra.feetrackerapp.PublicMethods;
import com.zahra.feetrackerapp.R;
import com.zahra.feetrackerapp.login.LoginActivity;
import com.zahra.feetrackerapp.utils.views.myEditText;
import com.zahra.feetrackerapp.utils.views.myRegularText;

public class RegisterActivity extends AppCompatActivity implements RegisterContract.View {
    RegisterPresenter presenter = new RegisterPresenter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter.attachView(RegisterActivity.this);

        setContentView(R.layout.activity_register);

        TextView sin = findViewById(R.id.sin);
        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.goToLogin();
            }
        });
        final myEditText username = findViewById(R.id.username);
        final myEditText password = findViewById(R.id.password);
        final myEditText email = findViewById(R.id.email);
        myRegularText register = findViewById(R.id.register);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.handleRegisterRequest(username.text(), password.text(), email.text());
            }
        });

    }

    @Override
    public void goToLogin() {
        Intent destination = new Intent(RegisterActivity.this, LoginActivity.class);
        RegisterActivity.this.startActivity(destination);
    }

    @Override
    public void showResult(String msg) {
        PublicMethods.showToast(RegisterActivity.this, msg);
    }

    @Override
    public void showMessageDialog(int msg) {
        final AlertDialog msgDialog = new AlertDialog.Builder(this).create();
//        final AlertDialog msgDialog = new AlertDialog.Builder(new ContextThemeWrapper
//                (RegisterActivity.this, R.style.AlertDialogCustom)).create();
        msgDialog.setMessage(getString(msg) + "OK");
        msgDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "GOT IT!", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                msgDialog.dismiss();
                goToLogin();
            }
        });
        msgDialog.show();
    }


}
