package com.zahra.feetrackerapp.Register;

public interface RegisterContract {
    interface View {
        void goToLogin();
        void showResult(String msg);
        void showMessageDialog(int msg);
    }

    interface Presenter {
        void attachView(View view);
        void goToLogin();
        void handleRegisterRequest(String username, String password, String email);
        void onResponseSuccess(RegisterPojoModel model);
        void onResponseFailure();
    }

    interface Model {
        void attachPresenter(Presenter presenter);
        void getActivationCode(String username, String password, String email);
    }
}
