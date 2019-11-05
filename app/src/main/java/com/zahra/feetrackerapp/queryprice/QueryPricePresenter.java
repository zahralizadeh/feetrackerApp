package com.zahra.feetrackerapp.queryprice;

import com.zahra.feetrackerapp.R;

public class QueryPricePresenter implements QueryPriceContract.Presenter {
    private QueryPriceContract.View view;
    QueryPriceModel model = new QueryPriceModel();

    @Override
    public void attachView(QueryPriceContract.View view) {
        this.view = view;
        model.attachPresenter(this);

    }

    @Override
    public void sendRequest(String location, String area, String age, String rooms, String offertype, String propertytype) {
        model.sendRequestToServer(location, area, age, rooms, offertype, propertytype);
    }

    @Override
    public void onResponseSuccess(QueryPricePojoModel response) {

        if (response.getStatus().equals("ok")) {
            view.showQueryResult(response.getAnswer());
        } else {
            view.showQueryResult(response.getMessage());
        }
    }

    @Override
    public void onResponseFailure() {
        view.showToast(R.string.server_error);
    }
}
