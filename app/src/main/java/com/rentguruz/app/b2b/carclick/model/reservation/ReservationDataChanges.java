package com.rentguruz.app.b2b.carclick.model.reservation;

import com.rentguruz.app.b2b.carclick.model.response.ReservationOriginDataModels;

import java.util.ArrayList;

public class ReservationDataChanges {

    public int ReservationId;

    public String CheckInDate,CheckOutDate;

    public Boolean SendNotificationToCustomer;

    public ArrayList<ReservationOriginDataModels> ReservationOriginDataModels = new ArrayList<ReservationOriginDataModels>();
}
