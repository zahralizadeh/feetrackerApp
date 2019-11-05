
package com.zahra.feetrackerapp.queryprice;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class QueryPricePojoModel {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("firstdata")
    @Expose
    private String firstdata;
    @SerializedName("lastdata")
    @Expose
    private String lastdata;
    @SerializedName("filter")
    @Expose
    private String filter;
    @SerializedName("count")
    @Expose
    private String count;
    @SerializedName("answer")
    @Expose
    private String answer;
    @SerializedName("message")
    @Expose
    private String message;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFirstdata() {
        return firstdata;
    }

    public void setFirstdata(String firstdata) {
        this.firstdata = firstdata;
    }

    public String getLastdata() {
        return lastdata;
    }

    public void setLastdata(String lastdata) {
        this.lastdata = lastdata;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
