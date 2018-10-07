package com.example.jason.first;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.content.Intent;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Locale;


public class MainActivity extends AppCompatActivity {
    ProgressBar prg;
    ImageButton increase1;
    ImageButton increase2;
    ImageButton increase3;
    Button title;
    Person p1;
    String name;
    int sex;
    double weight;
    Bundle bundle;
    TextView bacText;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bundle = getIntent().getExtras();
        name = bundle.getString("name1");
        sex = bundle.getInt("sex1", -1);
        weight = bundle.getDouble("weight1", 140.0);
        p1 = new Person(name, sex, weight);
        prg=findViewById(R.id.progressBar);
        increase1=findViewById(R.id.imageButton1);
        increase2=findViewById(R.id.imageButton2);
        increase3=findViewById(R.id.imageButton3);
        title=findViewById(R.id.titleButton);
        bacText = findViewById(R.id.bacValue);

        increase1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Drink beer = new Beer();
                p1.addDrinks(beer);
                bacText.setText(String.valueOf(String.format(Locale.ENGLISH, "%.3f", p1.bac)));
                prg.setProgress((int)(p1.bac*250));
            }
        });
        increase2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Drink wine = new Wine();
                p1.addDrinks(wine);
                bacText.setText(String.valueOf(String.format(Locale.ENGLISH, "%.3f", p1.bac)));
                prg.setProgress((int)(p1.bac*250));
            }
        });
        increase3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Drink liquor = new Liquor();
                p1.addDrinks(liquor);
                bacText.setText(String.valueOf(String.format(Locale.ENGLISH, "%.3f", p1.bac)));
                prg.setProgress((int)(p1.bac*250));
            }
        });
        title.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openTitleScreen();
            }
        });


    }
    public void openTitleScreen(){
        Intent intent = new Intent(this, TitleScreen.class);
        startActivity(intent);
    }
}
