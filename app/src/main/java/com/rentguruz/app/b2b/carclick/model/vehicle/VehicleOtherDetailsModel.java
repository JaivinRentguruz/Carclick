package com.rentguruz.app.b2b.carclick.model.vehicle;

import com.rentguruz.app.b2b.carclick.model.base.BaseModel;

import java.io.Serializable;

public class VehicleOtherDetailsModel extends BaseModel implements Serializable {

    public Double AdditionalExpenses;

    public String Description,MOTExpiryDate,Memo,ModelCode,PHVExpiryDate,PHVNumber,TaxDiscExpiryDate;

    public int RateId,VehicleId;
}
