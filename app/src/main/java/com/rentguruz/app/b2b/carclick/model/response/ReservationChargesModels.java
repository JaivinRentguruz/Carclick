package com.rentguruz.app.b2b.carclick.model.response;

import com.rentguruz.app.b2b.carclick.model.base.BaseModel;

import java.io.Serializable;

public class ReservationChargesModels extends BaseModel implements Serializable {
    public int ChargeFor,Amount,AmountType,ChargeType;
    public Boolean IsTaxable;
}
