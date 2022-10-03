package com.rentguruz.app.b2b.carclick.home.testdesign;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

import androidx.annotation.NonNull;
import androidx.navigation.fragment.NavHostFragment;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import com.rentguruz.app.b2b.carclick.R;
import com.rentguruz.app.b2b.carclick.base.BaseFragment;
import com.rentguruz.app.b2b.carclick.databinding.QvehiclePricingBinding;

import org.jetbrains.annotations.NotNull;

public class Vehicle_Select_pricing extends BaseFragment {

    QvehiclePricingBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = QvehiclePricingBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
        binding.setUiColor(UiColor);
        ImageHorizontalView imageHorizontalView = new ImageHorizontalView(getContext(),binding.horizontal);
        binding.horizontal2.setAdapter(imageHorizontalView);

        binding.horizontal.setAdapter(imageHorizontalView);

        binding.horizontal.setClipToPadding(false);
        binding.horizontal.setClipChildren(false);
        binding.horizontal.setOffscreenPageLimit(3);

        CompositePageTransformer compositePageTransformer = new CompositePageTransformer();
        compositePageTransformer.addTransformer(new MarginPageTransformer(40));
        compositePageTransformer.addTransformer(new ViewPager2.PageTransformer() {
            @Override
            public void transformPage(@NonNull @NotNull View page, float position) {
                float r = 1 - Math.abs(position);
                page.setScaleY(0.95f + r * 0.15f);
            }
        });

        binding.horizontal.setPageTransformer(compositePageTransformer);
        binding.horizontal.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
            }

            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                super.onPageScrollStateChanged(state);
            }
        });


        binding.header.discard.setText("Next Screen");
        binding.header.discard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(Vehicle_Select_pricing.this).navigate(R.id.vehicle_pricing_category);
            }
        });

        binding.header.back.setOnClickListener(v -> NavHostFragment.findNavController(Vehicle_Select_pricing.this).popBackStack());
    }


    @Override
    protected int getFragmentLayout() {
        return binding.getRoot().getId();
    }

    @Override
    public void onClick(View v) {

    }
}
