package com.rentguruz.app.b2b.carclick.model.response;

import java.io.Serializable;

public class ReservationDriversModel implements Serializable {
    public int DriverId;

    public ReservationDriversModel(int driverId) {
        DriverId = driverId;
    }
}
