package com.zahra.feetrackerapp.login;

public interface LoginContract {
    interface View{
    }
    interface Presenter{
        void attachView(View view);
        void checkAuthority(String username, String password);
    }
    interface Model{
        void attachPresenter(Presenter presenter);
    }
}
