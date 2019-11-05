package com.zahra.feetrackerapp.login;

public interface LoginContract {
    interface View{
        void showLoginResult(int msg);
        void showLoginResult(String msg);
        void goToRegister();
        void goToQuery();

    }
    interface Presenter{
        void attachView(View view);
        void checkAuthority(String username, String password);
        void onLoginSuccess(LoginPojoModel model);
        void onLoginFailure();
        void goToRegister();
    }
    interface Model{
        void attachPresenter(Presenter presenter);
        void checkAuthorityOnWeb(String username,String password);
    }
}
