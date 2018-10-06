package com.example.jason.first;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TitleScreen extends AppCompatActivity {

    Button MainScreen;
//    public static final String EXTRA_NAME = "com.example.application.example.EXTRA_NAME";
//    public static final String EXTRA_SEX = "com.example.application.example.EXTRA_SEX";
//    public static final String EXTRA_WEIGHT = "com.example.application.example.EXTRA_WEIGHT";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title_screen);
        MainScreen=findViewById(R.id.button);




        MainScreen.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openMainScreen();
            }
        });


    }
    public void openMainScreen(){
//        EditText editName = findViewById(R.id.textInputLayout);
//        String name = editName.getText().toString();
//        EditText editWeight = findViewById(R.id.textInputLayout3);
//        int weight = Integer.parseInt(editWeight.getText().toString());

        Intent intent1 = new Intent(this, MainActivity.class);
//        intent1.putExtra(EXTRA_NAME, name);
//        intent1.putExtra(EXTRA_WEIGHT, weight);
        startActivity(intent1);
    }
}
