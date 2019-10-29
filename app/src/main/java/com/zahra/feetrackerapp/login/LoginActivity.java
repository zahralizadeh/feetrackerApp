package com.zahra.feetrackerapp.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.zahra.feetrackerapp.PublicMethods;
import com.zahra.feetrackerapp.R;
import com.zahra.feetrackerapp.Register.RegisterActivity;
import com.zahra.feetrackerapp.utils.views.myEditText;
import com.zahra.feetrackerapp.utils.views.myRegularText;

public class LoginActivity extends AppCompatActivity implements LoginContract.View {
    LoginPresenter presenter = new LoginPresenter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);
        presenter.attachView(this);
        TextView sup = findViewById(R.id.sup);
        sup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.goToRegister();
            }
        });
        TextView act = findViewById(R.id.act);
        act.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.goToRegister();
            }
        });

        final myEditText username_txt = findViewById(R.id.username);
        final myEditText password_txt = findViewById(R.id.password);


        final myRegularText login_btn = findViewById(R.id.login);
        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.checkAuthority(username_txt.text(), password_txt.text());
            }
        });


//        myButton login_btn = (myButton) findViewById(R.id.login);
//        login_btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                presenter.checkAuthority(username_txt.text(), password_txt.text());
//            }
//        });
    }

    @Override
    public void showLoginResult(String msg) {
        PublicMethods.showToast(LoginActivity.this, msg);
    }


    @Override
    public void goToRegister() {
        Intent destination = new Intent(LoginActivity.this, RegisterActivity.class);
        LoginActivity.this.startActivity(destination);
    }
}
