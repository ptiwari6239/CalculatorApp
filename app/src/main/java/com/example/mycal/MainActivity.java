package com.example.mycal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText no1,no2,no3;
    Button b1,b2,b3,b4;
    double n1,n2,n3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        no1 = findViewById(R.id.txt1);
        no2 = findViewById(R.id.txt2);
        no3 = findViewById(R.id.txt3);

        b1 = findViewById(R.id.btnadd);
        b2 = findViewById(R.id.btnsub);
        b3 = findViewById(R.id.btnmul);
        b4 = findViewById(R.id.btndiv);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1 = Double.parseDouble(no1.getText().toString());
                n2 = Double.parseDouble(no2.getText().toString());
                n3 = n1 + n2 ;
                no3.setText(String.valueOf(n3));
                Toast.makeText(MainActivity.this, "ADDITION IS DONE", Toast.LENGTH_SHORT).show();

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1 = Double.parseDouble(no1.getText().toString());
                n2 = Double.parseDouble(no2.getText().toString());
                n3 = n1 - n2 ;
                no3.setText(String.valueOf(n3));
                Toast.makeText(MainActivity.this, "SUBTRACTION IS DONE", Toast.LENGTH_SHORT).show();

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1 = Double.parseDouble(no1.getText().toString());
                n2 = Double.parseDouble(no2.getText().toString());
                n3 = n1*n2;
                no3.setText(String.valueOf(n3));
                Toast.makeText(MainActivity.this, "MULTIPLICATION IS DONE", Toast.LENGTH_SHORT).show();

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1 = Double.parseDouble(no1.getText().toString());
                n2 = Double.parseDouble(no2.getText().toString());
                n3 = n1/n2;
                no3.setText(String.valueOf(n3));
                Toast.makeText(MainActivity.this, "DIVISION IN DONE", Toast.LENGTH_SHORT).show();
            }
        });
    }
}