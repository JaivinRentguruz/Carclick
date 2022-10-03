package com.rentguruz.app.b2b.carclick.model;

import com.rentguruz.app.b2b.carclick.model.base.BaseModel;

import java.io.Serializable;

public class BusinessSource extends BaseModel implements Serializable {
    public int Id,TableType;
    public String Name;
    public Boolean IsDefault;
}
