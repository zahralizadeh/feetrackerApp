package com.zahra.feetrackerapp.login;

import com.zahra.feetrackerapp.Constants;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginModel implements LoginContract.Model {
    private LoginContract.Presenter presenter;

    @Override
    public void attachPresenter(LoginContract.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void checkAuthorityOnWeb(String username, String password) {
        Constants.webInterface.login(username,password).enqueue(new Callback<LoginPojoModel>() {
            @Override
            public void onResponse(Call<LoginPojoModel> call, Response<LoginPojoModel> response) {
                LoginPojoModel model = response.body();
                presenter.onLoginSuccess(model);
            }

            @Override
            public void onFailure(Call<LoginPojoModel> call, Throwable t) {
                presenter.onLoginFailure();
            }
        });
    }
}
