package com.rentguruz.app.b2b.carclick.model;

import com.rentguruz.app.b2b.carclick.model.base.BaseModel;

import java.io.Serializable;

public class UserModel extends BaseModel implements Serializable {

   // public int Id,DetailId;
   // public boolean IsActive;

    public int UserType,UserFor,Id;
    public String UserName,Email,Password;
}
