package com.google.a19522132;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ListView lv;
    private String arr[] = {"Tèo", "Tý", "Bin", "Bo"};
    private TextView tv;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.lv);
        tv = (TextView) findViewById(R.id.tv) ;
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arr);

        lv.setAdapter(arrayAdapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Xử lý khi người dùng tương tác đế item thứ position
                tv.setText("position : " + position + ";value = " + arr[position]);
                parent.getChildAt(position).setBackgroundColor(0xFF00FF00);
                for (int i = 0; i < 4; i++) {
                    if (i != position)
                    {
                        parent.getChildAt(i).setBackgroundColor(000);
                    }
                }

            }
        });


    }
}

