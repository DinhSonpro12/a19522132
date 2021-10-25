package com.google.a19522132;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity_th6 extends AppCompatActivity {
    private Spinner spiner;
    private Button btn_add;
    private EditText name_food;
    private String thumnail= "Thumbnail 1";
    private CheckBox ck_promotion;
    private GridView mygridView;
    private CategoryAdapter categoryAdapter;

    private List<Category> getListCategory()
    {
        List<Category> List = new ArrayList<>();
        List.add(new Category("Thumbnail 1"));
        List.add(new Category("Thumbnail 2"));
        List.add(new Category("Thumbnail 3"));
        List.add(new Category("Thumbnail 4"));


        return List;

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_th6);
 // Tạo spinner
        spiner = findViewById(R.id.spn_dialog);
        categoryAdapter = new CategoryAdapter(this, R.layout.item_selected, getListCategory());
        spiner.setAdapter(categoryAdapter);
        spiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                thumnail = categoryAdapter.getItem(i).getName();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });




        btn_add = (Button) findViewById(R.id.btn_add);



        ArrayList<String> name = new ArrayList<>();
        ArrayList<Integer> image = new ArrayList<Integer>();
        ArrayList<Boolean> promotion = new ArrayList<>();
        promotion.add(true);
        grid_adaper gridAdaper = new grid_adaper(this, name, image, promotion);
        mygridView = (GridView) findViewById(R.id.grid_view);
        CheckBox ck_promotion = (CheckBox) findViewById(R.id.ckb_promotion);
        mygridView.setAdapter(gridAdaper);




        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                name_food = (EditText) findViewById(R.id.edt_name);
                name.add(name_food.getText().toString());
                if (thumnail == "Thumbnail 2") {
                    image.add(2);
                }
                else
                {
                    if (thumnail == "Thumbnail 3")
                    {
                        image.add(3);
                    }
                    else
                    {
                        if (thumnail == "Thumbnail 4")
                        {
                            image.add(4);
                        }
                        else
                        {
                            image.add(1);
                        }
                    }
                }


                if (ck_promotion.isChecked() == true)
                {
                    promotion.add(true);
                }
                else
                {
                    promotion.add(false);
                }

                gridAdaper.notifyDataSetChanged();
            }
        });



    }

}