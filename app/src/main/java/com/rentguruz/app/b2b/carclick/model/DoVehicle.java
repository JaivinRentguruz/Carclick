package com.rentguruz.app.b2b.carclick.model;


import com.rentguruz.app.b2b.carclick.model.base.BaseModel;
import com.rentguruz.app.b2b.carclick.model.response.AttachmentsModel;
import com.rentguruz.app.b2b.carclick.model.vehicle.VehiclePurchaseDetailsModel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DoVehicle extends BaseModel implements Serializable {
    public String ColorExterior,ColorInterior,KeyCode,LicenseNumber,
            MakeName,Manufacturer,ModelName,Number,VinNumber;

    public int CurrentLocation,EngineId,FuelType,NoOfBags,NoOfDoors,
            NoOfSeats,OwningLocation,Status,TankSize,Transmission,VehicleCategoryId,
            VehicleMakeId,VehicleModelId,VehicleTypeId,Year;

    public int Id;

    public String TransmissionDesc,FuelTypeDesc;

    public List<VehicleOptionMappingModel>  VehicleOptionMappingModel = new ArrayList<>();

    public VehicleOtherDetailsModel VehicleOtherDetailsModel = new VehicleOtherDetailsModel();
    public VehiclePurchaseDetailsModel VehiclePurchaseDetailsModel = new VehiclePurchaseDetailsModel();

    public ArrayList<AttachmentsModel> AttachmentsModels = new ArrayList<>();
}
