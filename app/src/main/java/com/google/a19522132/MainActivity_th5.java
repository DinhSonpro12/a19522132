package com.google.a19522132;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity_th5 extends AppCompatActivity {
    private EditText edt_id;
    private EditText edt_name;
    private CheckBox ckb_ismanager;
    private Button btn_nhap;
    private ArrayList<Employee> arrEmployee = new ArrayList<Employee>();
    private ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_th5);
        btn_nhap = (Button) findViewById(R.id.btn_add);
        lv = (ListView) findViewById(R.id.lv);
        edt_id = (EditText) findViewById(R.id.edt_manv);
        edt_name = (EditText) findViewById(R.id.edt_tennv);
        ckb_ismanager = (CheckBox) findViewById(R.id.ckb_ismanager);

        EmployeeAdapter arrayAdapter = new EmployeeAdapter(this, R.layout.item_employee, arrEmployee);

        lv.setAdapter(arrayAdapter);


        btn_nhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Employee employee = new Employee(edt_id.getText().toString(), edt_name.getText().toString());
                if (ckb_ismanager.isChecked())
                {
                    employee.setIsManager(true);
                }
                arrEmployee.add(employee);
                arrayAdapter.notifyDataSetChanged();


            }
        });
    }
}