package com.example.jason.first;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.content.Intent;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ProgressBar prg;
    ImageButton increase1;
    ImageButton increase2;
    ImageButton increase3;
    Button decrease;
    Button title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        prg=findViewById(R.id.progressBar);
        increase1=findViewById(R.id.imageButton1);
        increase2=findViewById(R.id.imageButton2);
        increase3=findViewById(R.id.imageButton3);
        decrease=findViewById(R.id.button5);
        title=findViewById(R.id.titleButton);

        increase1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                prg.setProgress(prg.getProgress()+10);
            }
        });
        increase2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                prg.setProgress(prg.getProgress()+15);
            }
        });
        increase3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                prg.setProgress(prg.getProgress()+20);
            }
        });
        decrease.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                prg.setProgress(prg.getProgress()-10);
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
