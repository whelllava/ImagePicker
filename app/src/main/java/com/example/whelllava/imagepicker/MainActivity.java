package com.example.whelllava.imagepicker;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ImageButton imgbtn;
    Dialog pickdialog;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgbtn = findViewById(R.id.image_picker);
        textView = findViewById(R.id.title_picker);


        pickdialog = new Dialog(this);
        imgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                ImageView close;
                pickdialog.setContentView(R.layout.my_picker);
                RecyclerView recyclerViewpicker = pickdialog.findViewById(R.id.recycler_image_picker);
                List<ImageModel> modelimage = new ArrayList<>();
                modelimage.add(new ImageModel(R.drawable.work, "Work"));
                modelimage.add(new ImageModel(R.drawable.weekly1, "Weekly 1"));
                modelimage.add(new ImageModel(R.drawable.study, "Study"));
                modelimage.add(new ImageModel(R.drawable.sleep, "Sleep"));
                modelimage.add(new ImageModel(R.drawable.mylove, "My Love"));
                modelimage.add(new ImageModel(R.drawable.gym, "Gym"));
                modelimage.add(new ImageModel(R.drawable.work, "Work"));
                modelimage.add(new ImageModel(R.drawable.weekly1, "Weekly 1"));
                modelimage.add(new ImageModel(R.drawable.study, "Study"));
                modelimage.add(new ImageModel(R.drawable.sleep, "Sleep"));
                modelimage.add(new ImageModel(R.drawable.mylove, "My Love"));
                modelimage.add(new ImageModel(R.drawable.gym, "Gym"));

                recyclerViewpicker.setAdapter(new RecycleViewImageAdabter(getApplicationContext(), modelimage));
                recyclerViewpicker.setLayoutManager(new GridLayoutManager(getApplicationContext(), 4));

                close = pickdialog.findViewById(R.id.close_picker);
                close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        pickdialog.dismiss();


                    }
                });
                pickdialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                pickdialog.show();



            }
        });
//        imgbtn.setBackgroundResource(getIntent().getIntExtra("Image" , -1));
//        textView.setText(getIntent().getStringExtra("Title"));

    }

}