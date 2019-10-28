package com.zahra.feetrackerapp.login;

public interface LoginContract {
    interface View{
        void onLoginSuccess(String msg);
        void onLoginFailure(String msg);
    }
    interface Presenter{
        void attachView(View view);
        void checkAuthority(String username, String password);
        void onLoginSuccess(LoginPojoModel model);
        void onLoginFailure();
    }
    interface Model{
        void attachPresenter(Presenter presenter);
        void checkAuthorityOnWeb(String username,String password);
    }
}
