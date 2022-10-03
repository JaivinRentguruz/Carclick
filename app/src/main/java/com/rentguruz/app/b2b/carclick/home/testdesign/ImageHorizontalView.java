package com.rentguruz.app.b2b.carclick.home.testdesign;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.rentguruz.app.b2b.carclick.R;

import org.jetbrains.annotations.NotNull;

public class ImageHorizontalView  extends RecyclerView.Adapter<ImageHorizontalView.ViewHolder> {

    private Context context;
    private ViewPager2 viewPager2;

    private int[] images = {R.drawable.cars_display_image_1,R.drawable.cars_display_image_2,R.drawable.cars_display_image_3,R.drawable.cars_display_image_4,R.drawable.cars_display_image_5,R.drawable.cars_display_image_6,R.drawable.cars_display_image_7,R.drawable.cars_display_image_8,R.drawable.cars_display_image_9,R.drawable.cars_display_image_10,
            R.drawable.cars_display_image_11,R.drawable.cars_display_image_12,R.drawable.cars_display_image_13,R.drawable.cars_display_image_14,R.drawable.cars_display_image_15,R.drawable.cars_display_image_16,R.drawable.cars_display_image_17,R.drawable.cars_display_image_18,R.drawable.cars_display_image_19,R.drawable.cars_display_image_20,
            R.drawable.cars_display_image_21,R.drawable.cars_display_image_22,R.drawable.cars_display_image_23,R.drawable.cars_display_image_24,R.drawable.cars_display_image_25,R.drawable.cars_display_image_26,R.drawable.cars_display_image_27,R.drawable.cars_display_image_28,R.drawable.cars_display_image_29,R.drawable.cars_display_image_30,
    };

    public ImageHorizontalView(Context context,ViewPager2 viewPager) {
        this.context = context;
        this.viewPager2 = viewPager;
    }

    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.qvehicle_image,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.images.setImageResource(images[position]);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView images;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            images = itemView.findViewById(R.id.carimgee);
        }
    }
}
