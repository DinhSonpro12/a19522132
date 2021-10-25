package com.google.a19522132;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity_th3 extends AppCompatActivity {

    private ListView lv;
    private ArrayList<String> arr = new ArrayList<String>();
    private TextView tv;
    private Button btn_nhap;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_th3);

        arr.add("Teo");
        arr.add("Ty");
        arr.add("Bin");
        arr.add("Bo");


        lv = (ListView) findViewById(R.id.lv);
        tv = (TextView) findViewById(R.id.tv) ;
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arr);

        lv.setAdapter(arrayAdapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Xử lý khi người dùng tương tác đế item thứ position
                tv.setText("position : " + position + ";value = " + arr.get(position));
                parent.getChildAt(position).setBackgroundColor(0xFF00FF00);
                for (int i = 0; i < arr.size(); i++) {
                    if (i != position)
                    {
                        parent.getChildAt(i).setBackgroundColor(000);
                    }
                }

            }
        });

        lv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener(){
            @Override
            public boolean onItemLongClick(AdapterView<?> av, View v, int pos, long id)
            {
                arr.remove(pos);
                arrayAdapter.notifyDataSetChanged();
                return true;
            }
        });


        btn_nhap = (Button) findViewById(R.id.btn_input);
        editText = (EditText) findViewById(R.id.edit_text);


        btn_nhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // do something when the corky is clicked
                String text = editText.getText().toString();
                arr.add(text);

                arrayAdapter.notifyDataSetChanged();

            }
        });

    }
}