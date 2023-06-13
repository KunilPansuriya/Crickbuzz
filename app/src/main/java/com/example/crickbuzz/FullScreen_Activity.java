package com.example.crickbuzz;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class FullScreen_Activity extends AppCompatActivity {


    ImageView imageView;
    TextView txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8;

    int imgArr[];
    String name[];
    String  num[];
    String born[];
    String place[];
    String nc[];
    String role[];
    String batting[];
    String bolling[];
    int position;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen);
        position=getIntent().getIntExtra("pos",0);
        name=getIntent().getStringArrayExtra("name");
        num=getIntent().getStringArrayExtra("num");
        imgArr=getIntent().getIntArrayExtra("img");
        born=getIntent().getStringArrayExtra("born");
        place=getIntent().getStringArrayExtra("place");
        nc=getIntent().getStringArrayExtra("nc");
        role=getIntent().getStringArrayExtra("role");
        batting=getIntent().getStringArrayExtra("batting");
        bolling=getIntent().getStringArrayExtra("bolling");

        imageView=findViewById(R.id.activity_full_img);
        txt1=findViewById(R.id.activity_full_name);
        txt2=findViewById(R.id.activity_full_num);
        txt3=findViewById(R.id.activity_full_born);
        txt4=findViewById(R.id.activity_place);
        txt5=findViewById(R.id.activity_nc);
        txt6=findViewById(R.id.activity_role);
        txt7=findViewById(R.id.activity_batting);
        txt8=findViewById(R.id.activity_boling);


        imageView.setImageResource(imgArr[position]);
        txt1.setText("Name    : "+name[position]);
        txt2.setText("Num     : \n"+num[position]);
        txt3.setText("Born    : \n"+born[position]);
        txt4.setText("Place   : \n"+place[position]);
        txt5.setText("Nc      : \n"+nc[position]);
        txt6.setText("Role    : \n"+role[position]);
        txt7.setText("Batting : \n"+batting[position]);
        txt8.setText("Bolling : \n"+bolling[position]);


    }
}