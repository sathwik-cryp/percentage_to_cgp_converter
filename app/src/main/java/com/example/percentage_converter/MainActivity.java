package com.example.percentage_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText no1,no2;
    Button b1;
    double n1,n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        no1=findViewById(R.id.txtNo1);
        no2=findViewById(R.id.txtNo2);

        b1 = findViewById(R.id.btnSub);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1 = Double.parseDouble(no1.getText().toString());
                n2 = n1/9.5;
                no2.setText(String.valueOf(n2));
            }
        });
    }
}