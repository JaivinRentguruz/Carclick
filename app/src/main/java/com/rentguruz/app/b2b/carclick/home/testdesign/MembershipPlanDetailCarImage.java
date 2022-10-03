package com.rentguruz.app.b2b.carclick.home.testdesign;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

import androidx.annotation.NonNull;
import androidx.navigation.fragment.NavHostFragment;

import com.rentguruz.app.b2b.carclick.base.BaseFragment;
import com.rentguruz.app.b2b.carclick.databinding.QmembershipConvertibleCarimageBinding;
import com.rentguruz.app.b2b.carclick.databinding.QmembershipConvertiblePlanBinding;

public class MembershipPlanDetailCarImage extends BaseFragment {

    QmembershipConvertibleCarimageBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = QmembershipConvertibleCarimageBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
        binding.setUiColor(UiColor);

        binding.header.back.setOnClickListener(v -> NavHostFragment.findNavController(MembershipPlanDetailCarImage.this).popBackStack());
    }


    @Override
    protected int getFragmentLayout() {
        return binding.getRoot().getId();
    }

    @Override
    public void onClick(View v) {

    }
}
