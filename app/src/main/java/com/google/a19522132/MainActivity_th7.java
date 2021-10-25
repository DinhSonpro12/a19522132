package com.google.a19522132;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import java.util.ArrayList;

public class MainActivity_th7 extends AppCompatActivity {
    private EditText manv;
    private EditText tennv;
    private RadioButton btn_ct;
    private RadioButton btn_tv;
    private Button btn_nhap;
    private RecyclerView itemrv;
    private ArrayList<Employee> arrEmployee = new ArrayList<>();
    private String tag = "ALO";





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_th7);

        manv = (EditText) findViewById(R.id.edt_manv);
        tennv =(EditText) findViewById(R.id.edt_tennv);
        btn_ct =  (RadioButton) findViewById(R.id.rbtn_ct);
        btn_tv = (RadioButton) findViewById(R.id.rbtn_tv);
        btn_nhap = (Button) findViewById(R.id.btn_add);

        btn_ct.setChecked(true);
        btn_ct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // do something when the corky is clicked
                btn_tv.setChecked(false);
            }
        });
        btn_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // do something when the corky is clicked
                btn_ct.setChecked(false);
            }
        });


        itemrv = findViewById(R.id.recycleview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        itemrv.setLayoutManager(layoutManager);
        itemrv.setHasFixedSize(true);
        AdapterRecyclerView adapterRecycler = new AdapterRecyclerView(this, arrEmployee);
        itemrv.setAdapter(adapterRecycler);


        btn_nhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ma_nv = manv.getText().toString();
                String ten_nv =  tennv.getText().toString();
                if (btn_ct.isChecked())
                {
                    Employee a = new Employee(ma_nv ,ten_nv);
                    a.setIsManager(true);
                    arrEmployee.add(a);
                    adapterRecycler.notifyDataSetChanged();

                }
                if (btn_tv.isChecked())
                {
                    Employee a = new Employee(ma_nv ,ten_nv);
                    a.setIsManager(false);
                    arrEmployee.add(a);
                    adapterRecycler.notifyDataSetChanged();

                }
            }
        });






    }
}