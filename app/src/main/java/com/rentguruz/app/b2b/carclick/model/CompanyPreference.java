package com.rentguruz.app.b2b.carclick.model;

import com.rentguruz.app.b2b.carclick.model.response.RIchauffer;

import java.io.Serializable;
import java.util.ArrayList;

public class CompanyPreference implements Serializable {
    public ArrayList<BookingNoOfDaysValue> BookingNoOfDaysValue = new ArrayList<>();
    public RsvReadyForCheckoutHoursValue RsvReadyForCheckoutHoursValue = new RsvReadyForCheckoutHoursValue();
    public ArrayList<CustomerAgeLimitValue> CustomerAgeLimitValue = new ArrayList<>();
    public Boolean DefaultBookingOnVehicleType,AllowCustomerInsurance;
}
