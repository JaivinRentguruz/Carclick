package com.rentguruz.app.b2b.carclick.home.testdesign;

import android.Manifest;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.navigation.fragment.NavHostFragment;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.rentguruz.app.b2b.carclick.R;
import com.rentguruz.app.b2b.carclick.base.BaseFragment;
import com.rentguruz.app.b2b.carclick.databinding.QvehicleDeliveryBinding;
import com.sdsmdg.harjot.vectormaster.VectorMasterDrawable;

import org.jetbrains.annotations.NotNull;

public class Vehicle_Delivery extends BaseFragment implements OnMapReadyCallback {

    QvehicleDeliveryBinding binding;
    private GoogleMap googleMap;
    final int LOCATION_REQUEST_CODE = 1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = QvehicleDeliveryBinding.inflate(inflater, container, false);
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
                NavHostFragment.findNavController(Vehicle_Delivery.this).navigate(R.id.vehicle_pricing);
            }
        });

        binding.header.back.setOnClickListener(v -> NavHostFragment.findNavController(Vehicle_Delivery.this).popBackStack());


        MapsInitializer.initialize(this.getActivity());
        binding.mapView.getMapAsync(this);
        if (ActivityCompat.checkSelfPermission(getActivity(), android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED
                && ActivityCompat.checkSelfPermission(getActivity(), android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED
                && ActivityCompat.checkSelfPermission(getActivity(), Manifest.permission.READ_EXTERNAL_STORAGE)!= PackageManager.PERMISSION_GRANTED)
        {
            ActivityCompat.requestPermissions(getActivity(),new String[] {android.Manifest.permission.ACCESS_FINE_LOCATION,android.Manifest.permission.READ_EXTERNAL_STORAGE}, LOCATION_REQUEST_CODE);
        }
        else
        {
            binding.mapView.getMapAsync(this);
        }

        try {
            binding.mapView.onCreate(savedInstanceState);
            MapsInitializer.initialize(getActivity());
            binding.mapView.getMapAsync(this);
        } catch (Exception e){
            e.printStackTrace();
        }
    }


    @Override
    protected int getFragmentLayout() {
        return binding.getRoot().getId();
    }

    @Override
    public void onClick(View v) {

    }


    @Override
    public void onDestroy()
    {
        try {
            binding.mapView.onDestroy();
        } catch (Exception e){
            e.printStackTrace();
        }
        super.onDestroy();

    }

    @Override
    public void onLowMemory()
    {
        try {
            super.onLowMemory();
            binding.mapView.onLowMemory();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void onResume()
    {
        try
        {
            super.onResume();
            binding.mapView.onResume();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void onMapReady(@NonNull @NotNull GoogleMap gMap) {
        googleMap = gMap;
        googleMap.getUiSettings().setZoomControlsEnabled(true);
        googleMap.getUiSettings().setZoomGesturesEnabled(true);
        googleMap.getUiSettings().setMyLocationButtonEnabled(true);
        googleMap.getUiSettings().setRotateGesturesEnabled(true);
        googleMap.getUiSettings().setTiltGesturesEnabled(true);
        googleMap.getUiSettings().setCompassEnabled(true);
        googleMap.getUiSettings().setScrollGesturesEnabled(true);
        googleMap.getUiSettings().setAllGesturesEnabled(true);
        googleMap.getUiSettings().setIndoorLevelPickerEnabled(true);
        googleMap.animateCamera(CameraUpdateFactory.zoomTo(10));

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                    /*LatLng sydney = new LatLng(-34, 151);
                    googleMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
                    googleMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
                    getMapLocation();*/
                getMapLocation();
            }
        },1000);
    }


    public void getMapLocation(){
       // Drawable circleDrawable = getResources().getDrawable(R.drawable.ic_markerpin2);

        Drawable drawable = getResources().getDrawable(R.drawable.ic_markerpin2);
        VectorMasterDrawable circleDrawable = new VectorMasterDrawable(context,R.drawable.ic_markerpin);
        circleDrawable.getPathModelByName("car").setFillColor(Color.parseColor(UiColor.secondary));
        circleDrawable.getPathModelByName("round1").setFillColor(Color.parseColor(UiColor.secondary));
        circleDrawable.getPathModelByName("round2").setFillColor(Color.parseColor(UiColor.secondary));

        BitmapDescriptor markerIcon = getMarkerIconFromDrawable(circleDrawable);

        googleMap.moveCamera(CameraUpdateFactory.newLatLng(
                new LatLng(-34, 151)
        ));

        Marker marker = googleMap.addMarker(new MarkerOptions()
                .position( new LatLng(-34, 151))
                //.title("Title")
                //.icon(BitmapDescriptorFactory.fromResource(R.drawable.car_placeholder_2))
                // .icon(BitmapDescriptorFactory.fromResource(R.drawable.gray_marker))
                .icon(markerIcon));
        // .snippet("City"));
      /*  CustomInfoWindowAdapter adapters = new CustomInfoWindowAdapter(getActivity());
        googleMap.setInfoWindowAdapter(adapters);*/
        googleMap.animateCamera(CameraUpdateFactory.zoomTo(15));
        marker.showInfoWindow();

    }

    private BitmapDescriptor getMarkerIconFromDrawable(Drawable drawable) {
        Canvas canvas = new Canvas();
        Bitmap bitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        canvas.setBitmap(bitmap);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        drawable.draw(canvas);
        return BitmapDescriptorFactory.fromBitmap(bitmap);
    }
}
