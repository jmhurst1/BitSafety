package com.example.jason.first;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;


public class TitleScreen extends AppCompatActivity {

    Button MainScreen;
    RadioGroup radioSexGroup;
    RadioButton Male;
    RadioButton returnedButton;
    EditText editName;
    EditText editWeight;
    double weight;
    int sex;
    String name;
    Bundle bundle;
    Intent intent1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title_screen);
        MainScreen = findViewById(R.id.button);


        MainScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainScreen();
            }
        });


    }

    public void openMainScreen() {
        editName = findViewById(R.id.plain_text_input);
        name = editName.getText().toString();

        radioSexGroup = findViewById(R.id.radioGroup);
        int selectedId = radioSexGroup.getCheckedRadioButtonId();
        returnedButton = findViewById(selectedId);
        Male = findViewById(R.id.radioMaleButton);
        if (returnedButton == (Male)) {
            sex = -1;
        } else {
            sex = 1;
        }

        editWeight = findViewById(R.id.plain_text_input2);
        weight = (double)Integer.parseInt(editWeight.getText().toString());

        intent1 = new Intent(TitleScreen.this, MainActivity.class);

        bundle = new Bundle();
        bundle.putString("name1", name);
        bundle.putDouble("weight1", weight);
        bundle.putInt("sex1", sex);
        intent1.putExtras(bundle);
//        intent1.putExtra("weight", weight);
//        intent1.putExtra("name", name);
//        intent1.putExtra("sex", sex);
        startActivity(intent1);

    }

}
