package com.google.a19522132;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class CategoryAdapter extends ArrayAdapter<Category> {
    public CategoryAdapter(Context context, int resource, List<Category> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_category, parent, false);
        TextView tvCategory = convertView.findViewById(R.id.tv_category);

        Category category = this.getItem(position);



        if (tvCategory != null) {
            tvCategory.setText(category.getName());
        }




        if ( category.getName() == "Thumbnail 1") {
            ImageView img = convertView.findViewById(R.id.img_category);
            img.setBackgroundResource(R.drawable.mon_1);
        }
        if ( category.getName() == "Thumbnail 2") {
            ImageView img = convertView.findViewById(R.id.img_category);
            img.setBackgroundResource(R.drawable.mon_2);
        }
        if ( category.getName() == "Thumbnail 3") {
            ImageView img = convertView.findViewById(R.id.img_category);
            img.setBackgroundResource(R.drawable.mon_3);
        }
        if ( category.getName() == "Thumbnail 4") {
            ImageView img = convertView.findViewById(R.id.img_category);
            img.setBackgroundResource(R.drawable.mon_4);
        }


        return convertView;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_selected, parent, false);
        TextView tvSelected = convertView.findViewById(R.id.tv_selected);
        Category category = this.getItem(position);

        if (tvSelected != null) {
            tvSelected.setText(category.getName());
        }


        return convertView;
    }
}
