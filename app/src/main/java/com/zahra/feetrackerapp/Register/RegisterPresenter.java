package com.zahra.feetrackerapp.Register;

import android.util.Log;

import com.zahra.feetrackerapp.R;

import static android.content.ContentValues.TAG;

public class RegisterPresenter implements RegisterContract.Presenter {
    private RegisterContract.View view;
    RegisterModel model = new RegisterModel();

    @Override
    public void attachView(RegisterContract.View view) {
        this.view = view;
        model.attachPresenter(this);
    }

    @Override
    public void goToLogin() {
        view.goToLogin();
    }

    @Override
    public void handleRegisterRequest(String username, String password, String email) {
        model.getActivationCode(username, password, email);
    }

    @Override
    public void onResponseSuccess(RegisterPojoModel model) {
        view.showResult(model.getMessage());
        Log.d(TAG, "onResponseSuccess: "+model.getStatus());

        if (model.getStatus().equals("ok")) {
            Log.d(TAG, "onResponseSuccess: "+model.getStatus());
            view.showMessageDialog(R.string.ActivatingLink);
        }
    }

    @Override
    public void onResponseFailure() {
        view.showResult("Registration was not successful, Try again!");

    }
}
