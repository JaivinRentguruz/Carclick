package com.rentguruz.app.b2b.carclick.home.testdesign;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

import androidx.annotation.NonNull;
import androidx.navigation.fragment.NavHostFragment;

import com.rentguruz.app.b2b.carclick.R;
import com.rentguruz.app.b2b.carclick.base.BaseFragment;
import com.rentguruz.app.b2b.carclick.databinding.QvehicleSelectDetailBinding;

public class Vehicle_Select_Detail extends BaseFragment {

    QvehicleSelectDetailBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = QvehicleSelectDetailBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
        binding.setUiColor(UiColor);

        binding.header.discard.setText("Next Screen");
        binding.header.discard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(Vehicle_Select_Detail.this).navigate(R.id.vehicle_pricing);
            }
        });

        binding.header.back.setOnClickListener(v -> NavHostFragment.findNavController(Vehicle_Select_Detail.this).popBackStack());
    }


    @Override
    protected int getFragmentLayout() {
        return binding.getRoot().getId();
    }

    @Override
    public void onClick(View v) {

    }
}
