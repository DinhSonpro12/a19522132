package com.google.a19522132;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;


public class EmployeeAdapter extends BaseAdapter{

    Context mycontext;
    int myLayout;
    List<Employee> arrEmployee ;
    public EmployeeAdapter(Context context, int layout, List<Employee> EmployeeList)
    {
        mycontext = context;
        myLayout = layout;
        arrEmployee = EmployeeList;

    }

    @Override
    public int getCount() {
        return arrEmployee.size();
    }

    @Override
    public Employee getItem(int i) {
        return arrEmployee.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) mycontext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(myLayout, null);

        LinearLayout ln_layout = (LinearLayout) view.findViewById(R.id.root);
        if (i%2 == 1) {
            ln_layout.setBackgroundColor(0xFF03DAC5);
        }



        TextView txt_hoten = (TextView) view.findViewById(R.id.item_employee_tv);
        txt_hoten.setText(arrEmployee.get(i).getName());

        TextView txt_id = (TextView) view.findViewById(R.id.item_employee_tv_position);


        ImageView img_view = (ImageView) view.findViewById(R.id.item_employee_iv_manager);
        if (arrEmployee.get(i).isManager()) {
            img_view.setVisibility(view.VISIBLE);
            txt_id.setText("");
        }
       else
        {
            img_view.setVisibility(view.GONE);
            txt_id.setText("Staff");
        }
       return view;
    }
}