package com.rentguruz.app.b2b.carclick.model;

import com.rentguruz.app.b2b.carclick.model.response.RIvehicleModel;

import java.io.Serializable;
import java.util.ArrayList;

public class ReservationCheckout implements Serializable {
    public int ReservationId;
    public RIvehicleModel ReservationVehicleModel = new RIvehicleModel();

   // public ReservationCheckListModels ReservationCheckListModels = new ReservationCheckListModels();

    public ReservationCheckOutModel ReservationCheckOutModel = new ReservationCheckOutModel();

    public ArrayList<ReservationCheckListModels> ReservationCheckListModels = new ArrayList<ReservationCheckListModels>();
}
