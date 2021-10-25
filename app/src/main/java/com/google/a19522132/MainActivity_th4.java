package com.google.a19522132;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;

import java.util.ArrayList;

public class MainActivity_th4 extends AppCompatActivity {
    private EditText manv;
    private EditText tennv;
    private RadioButton btn_ct;
    private RadioButton btn_tv;
    private Button btn_nhap;
    private ListView lv;
    private ArrayList<String> arr = new ArrayList<String>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_th4);

        manv = (EditText) findViewById(R.id.edt_manv);
        tennv =(EditText) findViewById(R.id.edt_tennv);
        btn_ct =  (RadioButton) findViewById(R.id.rbtn_ct);
        btn_tv = (RadioButton) findViewById(R.id.rbtn_tv);
        btn_nhap = (Button) findViewById(R.id.btn_add);
        lv = (ListView)findViewById(R.id.lv);

        btn_ct.setChecked(true);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arr);
        lv.setAdapter(arrayAdapter);




       btn_nhap.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String ma_nv = manv.getText().toString();
               String ten_nv =  tennv.getText().toString();
               if (btn_ct.isChecked())
               {
                   EmployeeFullTime a = new EmployeeFullTime(ma_nv ,ten_nv);
                   arr.add(a.ToString());
                   arrayAdapter.notifyDataSetChanged();
               }
               if (btn_tv.isChecked())
               {
                   EmployeePartTime a = new EmployeePartTime(ma_nv ,ten_nv);
                   arr.add(a.ToString());
                   arrayAdapter.notifyDataSetChanged();
               }
           }
       });

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
    }




}