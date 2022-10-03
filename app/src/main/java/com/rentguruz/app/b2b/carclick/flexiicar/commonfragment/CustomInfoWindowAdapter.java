package com.rentguruz.app.b2b.carclick.flexiicar.commonfragment;

import android.app.Activity;
import android.graphics.Color;
import android.view.View;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;
import com.rentguruz.app.b2b.carclick.R;
import com.rentguruz.app.b2b.carclick.databinding.CustomInfowindowBinding;
import com.rentguruz.app.b2b.carclick.model.base.UserData;

public class CustomInfoWindowAdapter implements GoogleMap.InfoWindowAdapter
{
    private Activity context;

    public CustomInfoWindowAdapter(Activity context)
    {
        this.context = context;
    }
    @Override
    public View getInfoWindow(Marker marker)
    {
        View view = context.getLayoutInflater().inflate(R.layout.custom_infowindow, null);
        CustomInfowindowBinding customInfowindowBinding = CustomInfowindowBinding.inflate( context.getLayoutInflater()) ;

/*
        TextView tvTitle = (TextView) view.findViewById(R.id.tv_title);
        TextView tvSubTitle = (TextView) view.findViewById(R.id.tv_subtitle);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.background);
        //linearLayout.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(UserData.UiColor.primary)));
        linearLayout.getBackground().setColorFilter(Color.parseColor(UserData.UiColor.primary), PorterDuff.Mode.ADD);
        tvTitle.setText(marker.getTitle());
        tvSubTitle.setText(marker.getSnippet());
*/
       // customInfowindowBinding.background.getBackground().setColorFilter(Color.parseColor(UserData.UiColor.primary), PorterDuff.Mode.ADD);
        customInfowindowBinding.man.getPathModelByName("one").setFillColor(Color.parseColor(UserData.UiColor.primary));
       customInfowindowBinding.setUiColor(UserData.UiColor);
       customInfowindowBinding.tvTitle.setText(marker.getTitle());
       customInfowindowBinding.tvSubtitle.setText(marker.getSnippet());
        return customInfowindowBinding.getRoot();
    }

    @Override
    public View getInfoContents(Marker marker)
    {

        return null;
    }


}
