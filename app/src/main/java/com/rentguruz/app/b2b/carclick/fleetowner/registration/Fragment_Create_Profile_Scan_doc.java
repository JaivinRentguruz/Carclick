package com.rentguruz.app.b2b.carclick.fleetowner.registration;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.rentguruz.app.b2b.carclick.R;
import com.rentguruz.app.b2b.carclick.fleetowner.ownerlogin.FleetOwner_Login;

public class Fragment_Create_Profile_Scan_doc extends Fragment
{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_create_profile, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);

        getActivity().getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);

        LinearLayout lbllogin = view.findViewById(R.id.lbl_enter_details);

        ImageView BackToLogin=view.findViewById(R.id.BackToLogin);

        BackToLogin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent i = new Intent(getActivity(), FleetOwner_Login.class);
                startActivity(i);
            }
        });
        lbllogin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                NavHostFragment.findNavController(Fragment_Create_Profile_Scan_doc.this)
                        .navigate(R.id.action_CreateProfile_to_DriverProfile);
            }
        });

        ImageView imgScanDrivingLicense = view.findViewById(R.id.imgScanDrivingLicense);
        imgScanDrivingLicense.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

               // Intent i = new Intent(getActivity(), ScanDrivingLicense.class);
                //i.putExtra("afterScanBackTo", 1);
                //startActivity(i);

            }
        });
    }
}

