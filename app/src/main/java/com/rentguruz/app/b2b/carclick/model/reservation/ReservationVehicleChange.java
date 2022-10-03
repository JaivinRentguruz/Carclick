package com.rentguruz.app.b2b.carclick.model.reservation;

import com.rentguruz.app.b2b.carclick.model.response.ReservationOriginDataModels;

import java.util.ArrayList;

public class ReservationVehicleChange {

    public Boolean IsNoExtraCharge,SendNotificationToCustomer;
    public int ReservationId,VehicleId,VehicleTypeId;

    public ArrayList<ReservationOriginDataModels> ReservationOriginDataModels = new ArrayList<ReservationOriginDataModels>();
}
