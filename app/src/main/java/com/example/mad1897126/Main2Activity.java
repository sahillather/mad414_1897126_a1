package com.example.mad1897126;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity
{
    Button b4;
    int a1,b1,c1;
    TextView sum,product;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        b4 = findViewById(R.id.button3);
        sum =  findViewById(R.id.t1);
        product = findViewById(R.id.t2);
        Intent intent = getIntent();
        a1 = intent.getIntExtra("a1",0);
        b1 = intent.getIntExtra("b1",0);
        c1 = intent.getIntExtra("c1",0);
         sum.setText("Sum - "+(a1+b1+c1));
         product.setText("Product - "+(a1*b1*c1));
         b4.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent i = new Intent(Main2Activity.this,MainActivity.class);
                 startActivity(i);
             }
         });



    }
}
