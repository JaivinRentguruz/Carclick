package com.rentguruz.app.b2b.carclick.model.display;

import com.rentguruz.app.b2b.carclick.model.AttachmentsModel;
import com.rentguruz.app.b2b.carclick.model.base.BaseModel;

import java.util.ArrayList;

public class SplashScreen extends BaseModel {

    public int Id;
    public String ContentType;
    public String DetailJson;
    public ArrayList<AttachmentsModel> AttachmentsModels = new ArrayList<>();
    public ArrayList<CMSManagementModels> CMSManagementModels = new ArrayList<>();
}
