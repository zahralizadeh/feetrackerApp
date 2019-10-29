package com.zahra.feetrackerapp.Register;

import com.zahra.feetrackerapp.Constants;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RegisterModel implements RegisterContract.Model {
    RegisterContract.Presenter presenter;
    @Override
    public void attachPresenter(RegisterContract.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void getActivationCode(String username, String password, String email) {
        Constants.webInterface.register(username,password,email).enqueue(new Callback<RegisterPojoModel>() {
            @Override
            public void onResponse(Call<RegisterPojoModel> call, Response<RegisterPojoModel> response) {
                presenter.onResponseSuccess(response.body());
            }

            @Override
            public void onFailure(Call<RegisterPojoModel> call, Throwable t) {
                presenter.onResponseFailure();

            }
        });
    }
}
