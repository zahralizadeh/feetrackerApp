package com.zahra.feetrackerapp.login;


import com.orhanobut.hawk.Hawk;
import com.zahra.feetrackerapp.R;

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
        model.checkAuthorityOnWeb(username, password);
    }

    @Override
    public void onLoginSuccess(LoginPojoModel model) {
        view.showLoginResult(model.getMessage());
        if (model.getStatus().equals("ok")) {
            Hawk.put("token", model.getToken());
            view.goToQuery();
        }
    }

    @Override
    public void onLoginFailure() {
        view.showLoginResult(R.string.server_error);

    }

    @Override
    public void goToRegister() {
        view.goToRegister();
    }
}
