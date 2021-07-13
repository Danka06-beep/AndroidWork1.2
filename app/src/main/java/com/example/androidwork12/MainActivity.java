package com.example.androidwork12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editName;
    EditText editEmal;
    String podpiska;
    TextView text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editName = findViewById(R.id.nameET);
        editEmal = findViewById(R.id.emailET);
        text = findViewById(R.id.viewName);

    }

    public void onClickButtonOk(View view){
       String name = editName.getText().toString();
       String emal = editEmal.getText().toString();
        podpiska = "Подписка на рассылку успешно оформлена для пользователя " + name +" на электронный адрес "+ emal;
        text.setText(podpiska);


    }
    public void onClickButtonClear(View view){
        text.setText("");
    }
}