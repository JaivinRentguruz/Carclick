package com.rentguruz.app.b2b.carclick.model.response;

import com.rentguruz.app.b2b.carclick.model.CompanyPreference;

import java.io.Serializable;

public class LoginResponse implements Serializable {
    public ApiUserLogin apiUserLogin;
    public User User;
    public LogedInCustomer LogedInCustomer;
    public CompanyLabel CompanyLabel;
    public CompanyPreference CompanyPreference = new CompanyPreference();
    public String CompanyKey;
}
