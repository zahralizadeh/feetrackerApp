package com.zahra.feetrackerapp.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.zahra.feetrackerapp.PublicMethods;
import com.zahra.feetrackerapp.R;
import com.zahra.feetrackerapp.Register.RegisterActivity;
import com.zahra.feetrackerapp.queryprice.QueryPriceActivity;
import com.zahra.feetrackerapp.utils.views.myEditText;
import com.zahra.feetrackerapp.utils.views.myTextView;

public class LoginActivity extends AppCompatActivity implements LoginContract.View {
    LoginPresenter presenter = new LoginPresenter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);
        presenter.attachView(this);
        TextView act = findViewById(R.id.act);
        act.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.goToRegister();
            }
        });

        final myEditText username_txt = findViewById(R.id.username);
        final myEditText password_txt = findViewById(R.id.password);


        final myTextView login_btn = findViewById(R.id.login);
        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.checkAuthority(username_txt.text(), password_txt.text());
            }
        });

    }

    @Override
    public void showLoginResult(int msg) {
        PublicMethods.showToast(LoginActivity.this, getString(msg));
        goToQuery();
    }

    @Override
    public void showLoginResult(String msg) {
        PublicMethods.showToast(LoginActivity.this, msg);
        goToQuery();
    }


    @Override
    public void goToRegister() {
        Intent destination = new Intent(LoginActivity.this, RegisterActivity.class);
        LoginActivity.this.startActivity(destination);
    }

    @Override
    public void goToQuery() {
        Intent destination = new Intent(LoginActivity.this, QueryPriceActivity.class);
        LoginActivity.this.startActivity(destination);
    }
}
