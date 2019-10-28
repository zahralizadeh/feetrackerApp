package com.zahra.feetrackerapp.login;

public class LoginModel implements LoginContract.Model {
    private LoginContract.Presenter presenter;

    @Override
    public void attachPresenter(LoginContract.Presenter presenter) {
        this.presenter = presenter;
    }
}
