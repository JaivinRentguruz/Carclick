package com.rentguruz.app.b2b.carclick.model.reservation;

import com.rentguruz.app.b2b.carclick.model.base.BaseModel;
import com.rentguruz.app.b2b.carclick.model.response.ReserversationSummary;

import java.io.Serializable;

public class ReservationInsurance extends BaseModel implements Serializable {

    public String ColorCode, Description, Name;

    public int DetailId,  LocationId;

    public ReserversationSummary ReservationSummaryDetailModel;

    public Double ExcessCharge,PerDayCharge;

    public Boolean IsActiveDetail, IsDefault, IsSelected, isShowNoData;
}
