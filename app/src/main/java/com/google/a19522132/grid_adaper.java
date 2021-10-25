package com.google.a19522132;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class grid_adaper extends BaseAdapter {
    Context mycontext;
    ArrayList<String> name;
    ArrayList<Integer> image;
    ArrayList<Boolean> promotion;
    public grid_adaper(Context mycontext, ArrayList<String> name, ArrayList<Integer> image, ArrayList<Boolean> promotion)
    {
        this.mycontext = mycontext;
        this.name = name;
        this.image = image;
        this.promotion = promotion;
    }

    @Override
    public int getCount() {
        return name.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) mycontext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(R.layout.item_grid, null);

        TextView txt_view = (TextView) view.findViewById(R.id.name_food);

        if (promotion.get(i) == true)
        {
            ImageView img_view = (ImageView) view.findViewById(R.id.promotion);
            img_view.setVisibility(View.VISIBLE);
        }
        else
        {
            ImageView img_view = (ImageView) view.findViewById(R.id.promotion);
            img_view.setVisibility(View.GONE);
        }
        txt_view.setText(name.get(i));
        RelativeLayout bg = (RelativeLayout) view.findViewById(R.id.background);
        if (image.get(i) == 1) {
            bg.setBackgroundResource(R.drawable.mon_1);
        }
        if (image.get(i) == 2) {
            bg.setBackgroundResource(R.drawable.mon_2);
        }
        if (image.get(i) == 3) {
            bg.setBackgroundResource(R.drawable.mon_3);
        }
        if (image.get(i) == 4) {
            bg.setBackgroundResource(R.drawable.mon_4);
        }

        txt_view.setSelected(true);






        return view;
    }
}
