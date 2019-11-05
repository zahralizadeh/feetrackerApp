package com.zahra.feetrackerapp.queryprice;

import com.zahra.feetrackerapp.Constants;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class QueryPriceModel implements QueryPriceContract.Model {
    private QueryPriceContract.Presenter presenter;

    @Override
    public void attachPresenter(QueryPriceContract.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void sendRequestToServer(String location, String area, String age, String rooms, String offertype, String propertytype) {
        Constants.webInterface.queryPrice(location, area, age, rooms, offertype, propertytype).
                enqueue(new Callback<QueryPricePojoModel>() {
                    @Override
                    public void onResponse(Call<QueryPricePojoModel> call, Response<QueryPricePojoModel> response) {
                        QueryPricePojoModel responseModel = response.body();
                        presenter.onResponseSuccess(responseModel);

                    }

                    @Override
                    public void onFailure(Call<QueryPricePojoModel> call, Throwable t) {
                        presenter.onResponseFailure();
                    }
                });
    }
}
