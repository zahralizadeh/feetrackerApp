package com.zahra.feetrackerapp.queryprice;

public interface QueryPriceContract {
    interface View {
        void showQueryResult(String msg);
        void showToast(int msg);
    }

    interface Presenter {
        void attachView(View view);
        void sendRequest(String location, String area, String age, String rooms, String offertype, String propertytype);
        void onResponseSuccess(QueryPricePojoModel response);
        void onResponseFailure();
    }

    interface Model {
        void attachPresenter(Presenter presenter);
        void sendRequestToServer(String location, String area, String age, String rooms, String offertype, String propertytype);
    }
}
