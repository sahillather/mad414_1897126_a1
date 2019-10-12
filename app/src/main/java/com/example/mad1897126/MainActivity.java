package com.example.mad1897126;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2,ed5;
    Button b1;
    int a,b,c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.button2);
        ed1 = findViewById(R.id.ed1);
        ed2 = findViewById(R.id.ed2);
        ed5 = findViewById(R.id.ed5);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Integer.parseInt(ed1.getText().toString());
                b = Integer.parseInt(ed2.getText().toString());
                c = Integer.parseInt(ed5.getText().toString());
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("a1",a);
                intent.putExtra("b1",b);
                intent.putExtra("c1",c);

                startActivity(intent);




            }
        });
    }
}
