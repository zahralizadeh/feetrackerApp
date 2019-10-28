package com.zahra.feetrackerapp.login;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.zahra.feetrackerapp.R;
import com.zahra.feetrackerapp.utils.views.myButton;
import com.zahra.feetrackerapp.utils.views.myEditText;

public class LoginActivity extends AppCompatActivity implements LoginContract.View {
    LoginPresenter presenter =new LoginPresenter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        myEditText username_txt = (myEditText)findViewById(R.id.username);
        myEditText password_txt = (myEditText)findViewById(R.id.password);
        myButton login_btn = (myButton)findViewById(R.id.login);
        presenter.attachView(this);
    }

}
