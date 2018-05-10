package com.example.vijay.bdd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button1,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button but4,but5;
        but4=(Button)findViewById(R.id.button);
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent to = new Intent(MainActivity.this, Main2Activity.class);

                startActivity(to);
            }
        });
        but5=(Button)findViewById(R.id.button2);
        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent to = new Intent(MainActivity.this, Main3Activity.class);

                startActivity(to);
            }
        });

    }
}
