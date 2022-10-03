package com.rentguruz.app.b2b.carclick.apicall;

public interface OnResponse<T>  {

    void onSuccess(T response);

    void onError(String error);
}
