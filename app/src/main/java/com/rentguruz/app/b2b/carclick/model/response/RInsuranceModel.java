package com.rentguruz.app.b2b.carclick.model.response;

import com.rentguruz.app.b2b.carclick.model.InsuranceModel;

import java.io.Serializable;

public class RInsuranceModel implements Serializable {
    public boolean IsSureInsurance = false,IsInsuranceDecline = false;
    public int NoOfDays,InsuranceCoverDetailId;
    public String Remarks,InsuranceDate;

    public InsuranceModel InsuranceDetailsModel = new InsuranceModel();

    public String Name;
}
