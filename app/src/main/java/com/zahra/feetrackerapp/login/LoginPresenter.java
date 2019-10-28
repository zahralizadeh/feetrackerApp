package com.zahra.feetrackerapp.login;

public class LoginPresenter implements LoginContract.Presenter {
    private LoginContract.View view;
    LoginModel model = new LoginModel();

    @Override
    public void attachView(LoginContract.View view) {
        this.view = view;
        model.attachPresenter(this);
    }

    @Override
    public void checkAuthority(String username, String password) {

    }
}
